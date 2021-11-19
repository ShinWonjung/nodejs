import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();

        int a, b, c;

        a = A * (B % 10);
        b = A * ((B % 100) / 10);
        c = A * (B / 100);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        b *= 10;
        c *= 100;

        System.out.println(a + b + c);
        
        in.close();
    }
}