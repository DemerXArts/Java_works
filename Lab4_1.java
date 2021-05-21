import java.util.Random;
import java.util.Scanner;

public class Lab41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = sc.nextInt();
        System.out.println("Введите число:");
        sc = new Scanner(System.in);
        int s = sc.nextInt();
        double[][] m = new double[n][n];
        Random r = new Random();
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<n; j++) {
                m[i][j] = r.nextDouble() + r.nextInt(100) - 50;
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        int k = 0;
        for (int i = 0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                if (m[i][j] <= 0) {
                    System.out.println(i + ", " + j + " ");
                    k++;
                }
                if (Math.abs(i - j) < s) {
                    System.out.println("Модуль разности " + Math.abs(i - j));
                }
            }
        }
        System.out.println(k);
    }
}
