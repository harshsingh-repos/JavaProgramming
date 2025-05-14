package PracticePrograms.Stringbuilder;

public class DeleteVowelsFromString {
    public static void main(String[] args) {
        String input = "awsedjikohu";
        StringBuilder sb = new StringBuilder(input);

        for(int i =0 ; i<sb.length(); i++){
            char ch  = sb.charAt(i);
            if("aeiouAEIOU".indexOf(ch)!= -1){
                sb.deleteCharAt(i);
                i--;
            }
        }
        System.out.println("Without vowels: " + sb.toString());
    }
}
