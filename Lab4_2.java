import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab42 {
    public static void main(String[] args){
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        n = sc.nextInt();
        System.out.println("Введите число:");
        sc = new Scanner(System.in);
        m = sc.nextInt();
        int[][] A = new int[n][m];
        Random r = new Random();
        for (int i = 0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = r.nextInt(100) - 50;
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        ArrayList<Integer> vector = new ArrayList<>();
        for (int i = 0; i<n; i++) {
            int c = 100;
            for (int j = 0; j < m; j++) {
                if (Math.abs(A[i][j]) < c)
                    c = Math.abs(A[i][j]);
            }
            vector.add(c);
        }
        for (int i = 0; i< m; i++) {
            System.out.println(vector.get(i));
        }
    }
}
