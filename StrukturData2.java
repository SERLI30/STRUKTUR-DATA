
package struktur.data2;

import java.util.Arrays;
import java.util.Scanner;

public class StrukturData2 {

    public static void main(String[] args) {
//        1. BUATLAH ARRAY I DIMENSI DENGAN 8 TIPE DATA PRIMITIF
        int[] a = {1, 2, 3, 4, 5};
        float[] c = {1.23f, 14.5f};
        byte[] d = {1, 2};
        double[] e = {1.43};
        char[] f = {'S', 'L'};
        boolean g[] = {true, false};
        long[] h = {1234345, 132324};
        short[] i = {2};

//   2. MENCETAK ARRAY DENGAN 5 METODE
//menggunakan tipe data int
        System.out.println("FOR");
        for (int j = 0; j < a.length; j++) {
            System.out.println(j);

        }
//        menggunakan tipe data long
        System.out.println("FOR-EACH");
        for (long j : h) {
            System.out.println(j);

        }
//        menggunakan tipe data byte
        System.out.println("WHILE");
        int r = 0;
        while (r < d.length) {
            System.out.println(d[r]);
            r++;

        }
//        menggunakan tipe data short
        System.out.println("DO-WHILE");
        int batas = 0;
        do {
            System.out.println(i[batas]);
            batas++;

        } while (batas < i.length);

//        menggunakan tipe data char
        System.out.println("Arrays.toString");
        System.out.println(Arrays.toString(f));

//          3. ARRAY 2 DIMENSI DENGAN INPUTAN
        Scanner serli = new Scanner(System.in);
        int[][] j = new int[3][3];
        for (int k = 0; k < j.length; k++) {
            for (int l = 0; l < j[k].length; l++) {
                System.out.println("(" + k + ")" + "(" + l + ")");
                j[k][l] = serli.nextInt();

            }
        }
    }
}

