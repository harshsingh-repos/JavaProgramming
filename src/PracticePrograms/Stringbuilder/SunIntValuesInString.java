package PracticePrograms.Stringbuilder;

public class SunIntValuesInString {
    public static void main(String[] args) {
        String input = "aabb12maninder77ashhsa10";

        int total = 0;
        StringBuilder numberBuilder = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isDigit(ch)) {
                numberBuilder.append(ch);
            } else {
                if (numberBuilder.length() > 0) {
                    total += Integer.parseInt(numberBuilder.toString());
                    numberBuilder.setLength(0);
                }
            }
        }

        // Add the last number if the string ends with digits
        if (numberBuilder.length() > 0) {
            total += Integer.parseInt(numberBuilder.toString());
        }

        System.out.println("Total sum of numbers: " + total);
    }
}
