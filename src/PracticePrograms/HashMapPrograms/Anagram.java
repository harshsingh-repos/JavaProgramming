package PracticePrograms.HashMapPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Check if Two Strings Are Anagrams
//        Problem: Use a HashMap to check if two strings are anagrams (i.e., contain the same letters with same frequency).
//
//        Example Input: "listen" and "silent"
//        Expected Output: true
public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(anagramCheck(str1,str2));
    }

    public static boolean anagramCheck(String string1, String string2) {
        if (string1.length() != string2.length()) return false;
        Map<Character, Integer> mapCount = new HashMap<>();
        for(char ch : string1.toCharArray() ){
            mapCount.put(ch, mapCount.getOrDefault(ch, 0)+1);
        }
        for(char ch : string2.toCharArray()){
            if(!mapCount.containsKey(ch)) return false;
            mapCount.put(ch, mapCount.get(ch)-1);
            if(mapCount.get(ch)<0) return false;
        }


        return true;
    }
}
