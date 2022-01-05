package Day3;

public class Exercise4 {
    public static void main(String[] args) {
        int a = 1;
        for (int b = 1; b <= 10; b++) {
            System.out.println(a + " * " + b + " = " + (a * b));
        }
//cach 2
        int x = 1, y = 1;
        while (y <= 10) {
            System.out.println(x + " * " + y + " = " + (a * y));
            y++;
        }
//Cach 3: In ra nhieu bang cuu chuong cung luc
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println("");
        }
    }
}
