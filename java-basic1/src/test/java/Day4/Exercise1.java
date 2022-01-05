package Day4;

public class Exercise1 {
    public static void main(String[] args) {
        String str1 = "Hello world ";
        String str2 = "HELLO WORLD 12";
        ignoreCase (str1, str2);
        ignoreCase ("aaa", "bb");
        }
    public static void ignoreCase(String str1, String str2) {
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println(str1.compareToIgnoreCase(str2));
        }
}
