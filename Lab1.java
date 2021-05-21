import java.util.Scanner;

public class Lab1 {

    public static void main (String[] args) {
        double x,y;
        double a,b,c;
        double q,g;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        x = sc.nextDouble();

        a = Math.cos(Math.sqrt(Math.abs(x)));
        b = Math.pow(a,2) + 5;
        c = Math.pow(Math.pow(Math.acos(a/b),6),0.2);

        q = 1/Math.tan(4 * x);
        g = Math.log(Math.pow(4,q)+5)/Math.log(2);

        y = c + g;

        boolean b1 = ((x >= -1.5) && (x <= 1.5) && (y >= -1.5) && (y <= 1.5));
        System.out.print(b1);
    }

}
