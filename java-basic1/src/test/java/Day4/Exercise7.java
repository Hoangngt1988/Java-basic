package Day4;

public class Exercise7 {
    public static void main(String[] args) {
        String str = "Hello World";
        String reStr = "";

        for(int i = str.length()-1; i >= 0; i--){
            reStr = reStr + str.charAt(i);
        }
        System.out.println("String: " + str);
        System.out.println("Reversed String: " + reStr);
    }
}
