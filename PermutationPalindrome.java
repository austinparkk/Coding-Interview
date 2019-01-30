class Solution {
    public static Boolean isPermutationPalindrome(String str) {
        int bitVector = 0;
        for (char c: str.toCharArray()){
            if (c >= 'a' && c <= 'z'){
                int char_value = c - 'a';
                bitVector = toggle (bitVector, char_value);
                System.out.println( c + " " + Integer.toString(bitVector, 2));
            }
        }

        //System.out.println(onlyOneOdd(bitVector));
        return (bitVector == 0 || onlyOneOdd(bitVector));
    }

    public static int toggle (int bitVector, int char_value){
        if (char_value < 0){
            return 0;
        }

        int current = 1 << char_value;
        return (bitVector ^ current);
    }

    public static boolean onlyOneOdd(int bitVector){
        if ((bitVector & (bitVector - 1)) == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(isPermutationPalindrome("tact coa"));
    }
}