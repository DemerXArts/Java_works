import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Lab5 {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку из прописных букв:");
        s = sc.next();
        ArrayList<CharConteiner> vector = new ArrayList<>();
        vector.add(new CharConteiner());
        vector.get(0).ch = s.charAt(0);
        int k = 1;
        for (int i=1; i<s.length();i++){
            boolean f = false;
            for (int j=0; j< vector.size(); j++){
                if (s.charAt(i) == vector.get(j).ch){
                    vector.get(j).count++;
                    f = true;
                }
            }
            if (!f){
                vector.add(new CharConteiner());
                vector.get(k).ch = s.charAt(i);
                k++;
            }
        }
        for (int j=0; j< vector.size(); j++){
            System.out.print(vector.get(j).ch + " ");
        }
        System.out.println();
        for (int j=0; j< vector.size(); j++){
            System.out.print(vector.get(j).count + " ");
        }
        System.out.println();
        for (int i = 0; i<vector.size(); i++){
            int mir = vector.get(i).count;
            char mor = vector.get(i).ch;
            int nir = i;
            for (int j = i + 1; j<vector.size(); j++){
                if (vector.get(j).count<mir){
                    mir = vector.get(j).count;
                    mor = vector.get(j).ch;
                    nir = j;
                }
            }
            vector.get(nir).count = vector.get(i).count;
            vector.get(nir).ch = vector.get(i).ch;
            vector.get(i).count = mir;
            vector.get(i).ch = mor;
        }
        for (int j=0; j< vector.size(); j++){
            System.out.print(vector.get(j).ch + " ");
        }
        System.out.println();
        for (int j=0; j< vector.size(); j++){
            System.out.print(vector.get(j).count + " ");
        }
    }
}
