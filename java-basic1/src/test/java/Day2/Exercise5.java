package Day2;

public class Exercise5 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = -3;
        input(x, y, z);
        input(4, -6, -6);
    }
    public static void input(int x, int y, int z) {
        if (x <= y && x <= z)
            System.out.println("So nho nhat la: " + x);
        else if (y <= z)
            System.out.println("So nho nhat la: " + y);
        else
            System.out.println("So nho nhat la: " + z);
    }
}
