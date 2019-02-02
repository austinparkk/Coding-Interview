class Solution {
    public static String stringCompression (String str){
        int count = 0;
        char current =  str.charAt(0);

        System.out.println("current: " + current);

        StringBuilder result = new StringBuilder();

        for (char c: str.toCharArray()){
            if (c == current){
                count++;
            } else {
                result.append(current);
                result.append(count);
                count = 1;
                current = c;
            }
        }
        result.append(current);
        result.append(count);
        return result.toString();
    }

    public static void main(String[] args){
        System.out.println(stringCompression("aaabbssccee"));
    }
}