import java.util.Scanner;
import java.util.Random;

public class Lab43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = sc.nextInt();
        int[] m = new int[n];
        Random r = new Random();
        for (int i = 0; i<n; i++) {
            m[i] = r.nextInt(3) - 1;
            System.out.print(m[i]+" ");
        }
        System.out.println();
        for (int i = 0; i<n; i++){
            int mir = m[i];
            int nir = i;
            for (int j = i + 1; j<n; j++){
                if (m[j]>mir){
                    mir = m[j];
                    nir = j;
                }
            }
            m[nir] = m[i];
            m[i] = mir;
        }
        for (int i = 0; i<n; i++) {
            System.out.print(m[i]+" ");
        }
    }
}
