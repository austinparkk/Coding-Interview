class Solution {

    public static void main(String[] args){
        char[] input = "Mr John Smith    ".toCharArray();
        System.out.println(input);  
        replaceSpaces(input, 13);
        System.out.println(input);
        System.out.println('b'-'a');
    }

    public static void replaceSpaces(char[] str, int trueLength){
        int index = str.length;
        for (int i = trueLength - 1; i > 0; i--){
            if (str[i] == ' '){
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
    }

    public static Boolean palPerm(String s){
        return true;
    }
}