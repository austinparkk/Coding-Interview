import java.util.List;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

class Solution{
    public static List<String> mostFrequentWord(String par, List<String> ignoreWords){
        String[] words = par.split("\\s");
        HashMap<String, Integer> map = new HashMap<>();

        for (String word: words){
            if (!ignoreWords.contains(word)){
                if (!map.containsKey(word)){
                    map.put(word, 1);
                } else {
                    int old = map.get(word);
                    map.replace(word, old, old + 1);
                }
            }
        }

        int highestOccurence = 0;

        for (Map.Entry<String, Integer> entry: map.entrySet()){
            if (entry.getValue() > highestOccurence){
                highestOccurence = entry.getValue();
            }
        }

        List<String> result = new ArrayList<String>();
        for (Map.Entry<String, Integer> entry: map.entrySet()){
            if (entry.getValue() == highestOccurence){
                result.add(entry.getKey());
            }
        }

        return result;
    }

    public static void main(String[] str){
        List<String> exclude = new ArrayList<String>();
        exclude.add("hi");

        System.out.println(mostFrequentWord("hi my name is austin austin", exclude));
    }
}