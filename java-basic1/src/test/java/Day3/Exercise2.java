package Day3;

public class Exercise2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
//cach 2
        int i = 1;
        while (i <=100) {
            if (i % 2 != 0)
                System.out.println(i);
            i++;
        }
    }
}
