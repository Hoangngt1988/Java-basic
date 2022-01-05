package Day2;

public class Exercise4 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = 3;
        input(x, y, z);
        input(5, 5, 3);
    }
    public static void input(int x, int y, int z) {
        if (x >= y && x >= z)
            System.out.println("So lon nhat la: " + x);
        else if (y >= z)
            System.out.println("So lon nhat la: " + y);
            else
            System.out.println("So lon nhat la: " + z);
     }
}
