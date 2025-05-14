package PracticePrograms.HashMapPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsHashMap {
    public static void main(String[] args) {
        String string = "This is a test this is only a test";
        String[] words = string.toLowerCase().split("\\s");
        Map<String, Integer> duplicateWord = new HashMap<>();

        for(String word : words){
            if(duplicateWord.containsKey(word)){
                duplicateWord.put(word, duplicateWord.get(word)+1);
            }else{
                duplicateWord.put(word, 1);
            }
        }
        System.out.println("Duplicate Words");
        for(Map.Entry<String, Integer> entry : duplicateWord.entrySet()){
            if (entry.getValue() > 1){
                System.out.println(entry.getKey());
            }
        }

    }
}
