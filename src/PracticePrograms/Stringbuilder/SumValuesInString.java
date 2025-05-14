package PracticePrograms.Stringbuilder;

import java.util.ArrayList;
import java.util.List;

public class SumValuesInString {
    public static void main(String[] args) {
        String input = "aehb12bnh34ksd56";

        List<Integer> numbers = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        for(int i =0 ; i <input.length(); i++){
            char ch = input.charAt(i);
            if(Character.isDigit(ch)){
                sb.append(ch);
            }else if (sb.length()>0){
                numbers.add(Integer.valueOf(sb.toString()));
                sb.setLength(0);
            }
        }

        if(sb.length()>0){
            numbers.add(Integer.valueOf(sb.toString()));
        }

        System.out.println("numbers found: " + numbers);


    }

}
