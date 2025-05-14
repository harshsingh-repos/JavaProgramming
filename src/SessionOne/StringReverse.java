package SessionOne;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Harshpreet";
        char[] ch = str.toCharArray();

        for(int i = 0; i< str.length()/2; i++) {
            int j = ch.length - 1 - i;
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;

        }
        String reversed = new String(ch);
        System.out.println("String reversed: " + reversed);
    }
}
