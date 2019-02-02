class Solution {

    public static String stringCompression(String str){
        int count = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++){
            count++;

            if ((i+1) >= str.length() || str.charAt(i) != str.charAt(i+1)){
                result.append(str.charAt(i));
                result.append(count);
                count = 0;
            }
        }
        return result.length() > str.length() ? str : result.toString();
    }

    public static void main(String[] args){
        System.out.println(stringCompression("aaabbssccee"));
    }
}