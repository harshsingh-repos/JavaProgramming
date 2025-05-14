package PracticePrograms.HashMapPrograms;

import java.util.HashMap;
import java.util.Map;

public class CountElementFrequency {
    public static void main(String[] args) {
        int[] array = {2, 3, 2, 5, 3, 3, 2};
        Map<Integer, Integer> elementCount = new HashMap<>();

        for(int ele: array){
            if(elementCount.containsKey(ele)){
                elementCount.put(ele, elementCount.get(ele)+1);
            }else{
                elementCount.put(ele, 1);
            }
        }
        System.out.println("Ptinr Element Count in Array");
        for(Map.Entry<Integer, Integer> entry : elementCount.entrySet()){
            System.out.println(entry.getKey() + " count is: " + entry.getValue() );
        }
    }
}
