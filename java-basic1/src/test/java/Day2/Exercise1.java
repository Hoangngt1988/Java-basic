package Day2;

public class Exercise1 {
    public static void main(String[] args) {
        int x = 2;
        input(x);
        input(3);
    }
    public static void input(int x) {
        if (x % 2 == 0)
            System.out.println(x + " la so chan");
        else
            System.out.println(x + " la so le");
    }
}
