package PracticePrograms.String;

public class StringReverse {

    public String reverse(String originalString) {
        char[] orignalCharList = originalString.toCharArray();

        String reversed = "";

        for (int i = 0; i < originalString.length() / 2; i++) {
            int j = originalString.length() - i - 1;
            char temp = orignalCharList[i];
            orignalCharList[i] = orignalCharList[j];
            orignalCharList[j] = temp;

        }
        reversed = new String(orignalCharList);
        return reversed;
    }


    public static void main(String[] args) {
        String originalString = "Harshpreet";
        StringReverse reverseObj = new StringReverse();
        String reversed = reverseObj.reverse(originalString);
        System.out.println(reversed);
    }
}
