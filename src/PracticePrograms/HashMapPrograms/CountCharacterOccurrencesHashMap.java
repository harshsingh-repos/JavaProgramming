package PracticePrograms.HashMapPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterOccurrencesHashMap {
    public static void main(String[] args) {
        String string = "This is an example for String";
        char[] chars = string.toCharArray();
        Map<Character, Integer> charCount = new HashMap<>();

        for(char ch : chars){
            if(charCount.containsKey(ch)){
                charCount.put(ch, charCount.get(ch)+1);
            }else{
                charCount.put(ch, 1);
            }
        }
        System.out.println("Print ch Occurrences");
        for(Map.Entry<Character, Integer> entry : charCount.entrySet()){
            System.out.println(entry.getKey() + " is repeated : " + entry.getValue());
        }

    }
}
