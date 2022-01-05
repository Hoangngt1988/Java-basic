package Day4;

public class Exercise2 {
    public static void main(String[] args) {
        String str1 = "Hello world ";
        String str2 = "HELLO WORLD 12";
        concatString (str1, str2);
        concatString ("aaa", "bb");
    }
    public static void concatString(String str1, String str2) {
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println(str1.concat(str2));
    }
}
