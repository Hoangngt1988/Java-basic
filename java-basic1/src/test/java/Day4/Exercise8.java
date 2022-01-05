package Day4;

public class Exercise8 {
    public static void main(String[] args) {
        String s = "Hello world";

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i))
                System.out.println(s.charAt(i));
            }
        count++;
    }
}
