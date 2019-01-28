
public class ArrayList{
    int[] array;
    int size = 5;
    int index =0;

    ArrayList(){
        array = new int[size];
    }
    
    public void insert(int x){
       if (index == size){
           size = size*2;
           int[] newArray = new int[size];
           for (int i = 0; i < array.length; i++){
               newArray[i] = array[i];
           }

           array = newArray;
       }

       array[index] = x;
       index++;
    }

    @Override
    public String toString(){
        StringBuilder outputString = new StringBuilder();

        outputString.append("array: ");
        for (int i = 0; i < size; i++){
            outputString.append(i + " = " + array[i]+ " ");
        }

        return outputString.toString();
    }

    public static void main(String[] args){
        ArrayList MyArray = new ArrayList();

        System.out.println(MyArray.toString());
        
        for (int i = 0; i < MyArray.size; i++){
            MyArray.insert(i);
        }

        MyArray.insert(5);
        MyArray.insert(5);

        System.out.println(MyArray.toString());
    }
}