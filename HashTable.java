
public class HashTable {

    private static int SIZE = 16;
    private HashEntry[] table = new HashEntry[SIZE];

    public void insert(Integer key, String value) {
        int index = key.hashCode() % table.length;

        HashEntry entry = new HashEntry(key, value);

        if (table[index] == null) {
            table[index] = entry;
        }

        else {
            HashEntry temp = table[index];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = entry;
        }
    }

    public String get(Integer key) {
        int index = key.hashCode() % table.length;

        if (table[index] != null) {
            HashEntry temp = table[index];

            while (temp.key != key && temp.next != null) {
                temp = temp.next;
            }
            return temp.value;
        }
        return null;
    }

    public class HashEntry {
        int key;
        String value;
        HashEntry next;

        HashEntry(int key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }

        @Override
        public String toString(){
            return "[" + key + ", " + value + "]";
        }
    }

    @Override
    public String toString(){
        int bucket = 0;
        StringBuilder outputString = new StringBuilder();

        for (HashEntry entry: table){
            if (entry == null){
                continue;
            }
            outputString.append("\n bucket[")
                .append(bucket)
                .append("] = ")
                .append(entry.toString());

            bucket++;

            HashEntry temp = entry;
            while (temp.next != null){
                temp = temp.next;
                outputString.append("->")
                    .append(temp.toString());
            }
        }
        return outputString.toString();
    }

    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        // Put some key values.
        for(int i=0; i<30; i++) {
            hashTable.insert(i, String.valueOf(i));
        }

        // Print the HashTable structure
        log("****   HashTable  ***");
        log(hashTable.toString());
        log("\nValue for key(20) : " + hashTable.get(20));
    }

    private static void log(String msg) {
        System.out.println(msg);
    }   
}