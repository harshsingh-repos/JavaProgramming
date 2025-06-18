package PracticePrograms;

public class CountOccurrences {
    public static void main(String[] args) {
        String str = "This is a string";
        char[] ch = str.toCharArray();
       boolean[] visited = new boolean[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if(visited[i]) continue;
            int count = 1;

            for (int j = i + 1; j < str.length(); j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println("Char : " + ch[i] + " count is: " + count);
        }
    }
}
