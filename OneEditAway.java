class Solution {

    public static boolean oneEditAway(String first, String second){
        return (checkReplace(first, second) || checkInsert(first, second) || checkInsert(second, first));
    }

    public static boolean checkReplace(String first, String second){
        if (first.length() != second.length()) return false;

        char[] firstString = first.toCharArray();
        char[] secondString = second.toCharArray();

        boolean oneDifferent = false;

        for (int i = 0; i < first.length(); i++){
            if (firstString[i] != secondString[i]) {
                if (oneDifferent){
                    return false;
                }
                oneDifferent = true;
            }
        }
        
        return true;
    }

    public static boolean checkInsert(String first, String second){

        if (first.length() != second.length() - 1){
            return false;
        }

        char[] firstString = first.toCharArray();
        char[] secondString = second.toCharArray();

        int i = 0;
        int y = 0;
        while (i < first.length()){
            if (firstString[i] != secondString[y]){
               if (i != y) return false;
               else {
                   y++;
               }
            } 
            i++;
            y++;
        }

        return true;
    }

    public static void main(String[] args){
        System.out.println(oneEditAway("pale", "ple"));
        System.out.println(oneEditAway("pales", "pale"));
        System.out.println(oneEditAway("pale", "bae"));

    }
    
}