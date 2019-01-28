
public class Scrap {
    public static void main(String[] args){
        //permutation("his");  
        System.out.println(isUnique("helllo"));
    }

    public static void permutation(String s){
        permutation(s, "");
    }

    public static void permutation(String s, String prefix){
        if (s.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < s.length(); i++){
                String rem = s.substring(0,i) + s.substring(i+1);
                System.out.println("i is: "+ i + " rem:" + rem + " prefix:" + prefix+s.charAt(i));
                permutation(rem, prefix+s.charAt(i));
            }

        }
    }

    public static Boolean isUnique(String str){
        int tracker = 0;
        char[] input_array = str.toCharArray();
        for (char c : input_array){
            int current = 1 << (c - 'a');
            if ((tracker & current) > 0){
                return false;
            }

            tracker |= current;
        }
        return true;
    }
}