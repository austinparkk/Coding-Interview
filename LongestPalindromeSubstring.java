class Solution {

    public static String longestPalindromeSubstring(String str){
        String longest = str.substring(0, 1);

        for (int i = 0; i < str.length() - 1; i++){
            if (helper(str, i, i).length() > longest.length()){
                longest = helper(str, i, i);
            } else if (helper(str, i, i + 1).length() > longest.length()){
                longest = helper(str, i, i + 1);
            }
        }

        return longest;
    }

    public static String helper(String str, int begin, int end){
        if (str.charAt(begin) != str.charAt(end)){
            return str.substring(begin, begin + 1);
        }

        while (begin >= 0 && end < str.length() && str.charAt(begin) == str.charAt(end)){
            begin--;
            end++;
        }

        return str.substring(begin + 1, end);
    }

    public static void main(String[] args){
        System.out.println(longestPalindromeSubstring("aybbycybabyc"));
        System.out.println(longestPalindromeSubstring("a"));
        System.out.println(longestPalindromeSubstring("acc"));
    }
}