package PracticePrograms.HashMapPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountWordOccurrencesHashMap {

    public static void main(String[] args) {
        String str = "This is an example String";
        String[] words = str.toLowerCase().split("\\s+");
        Map<String, Integer> wordCountMap = new HashMap<>();

        for(String word : words){
            if(wordCountMap.containsKey(word)){
                wordCountMap.put(word, wordCountMap.get(word)+1);
            }else{
                wordCountMap.put(word,1);
            }
        }
        System.out.println("Print Occurrences");
        for(Map.Entry<String , Integer> entry : wordCountMap.entrySet()){
            System.out.println(" " + entry.getKey() + " " + entry.getValue());

        }
    }

}
