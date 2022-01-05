package Day1;

public class Exercise03 {
   public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = x;
        System.out.println("x= "+ (x = y));
        System.out.println("y= "+ (y = z));

        int a = 1;
        int b = 2;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a= " + a);
        System.out.println("b= " + b);

    }
}
