import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        float x,y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextFloat();
        if (x <= 1) {
            y = (float) Math.asin(x/(Math.pow(x,2)+1));
        }else if (x < 2) {
            double a = Math.pow(x,4);
            y = (float) Math.log(a/(a+1));
        }else y = (float) Math.log10(Math.abs(Math.pow(2,-x)*Math.pow(x,4-x)));
        System.out.print(y);
    }
}
