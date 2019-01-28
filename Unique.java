import com.sun.xml.internal.messaging.saaj.util.FastInfosetReflection;

public class Unique {

    public static void main(String[] args){
        System.out.println(isUnique("heqiasdl").toString());
    }

    public static Boolean isUnique(String str){
        int checker = 0;
        for (int i = 0; i < str.length(); i ++){
            int val = str.charAt(i) - 'a';  
            if ((checker & (1 << val)) > 0){
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }
    
    public static Boolean isUnique1(String str){
        if (str.length() > 128) return false;

        boolean[] char_set = new boolean[128];

        for (int i = 0; i < str.length(); i++){
            int curr = str.charAt(i);

            if (char_set[curr]){
                return false;
            } else {
                char_set[curr] = true;
            }
        }
        return true; 
    }


}