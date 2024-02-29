
package struktur.data.arraylist;

import java.util.ArrayList;

public class StrukturDataArraylist {

    public static void main(String[] args) {
//        BUAT ARRAYLIST BERTIPE DATA WRAPPER DAN BERIKAN NILAI DAN CETAK ISI ARRAYLIST TERSEBUT
        ArrayList<Character> chare = new ArrayList< Character>();
        chare.add('S');
        chare.add('E');
        chare.add('L');
        chare.add('I');
        System.out.println(chare);

//        BUAT ARRAYLIST BERTIPE INTEGER DAN LAKUKAN PROSES PENAMBAHAN NILAI MENGAKSES NILAI PADA INDEX TERTENTU.MENGGANTI NILAI,MENGHAPUS NILAI DAN MEMBACA UKURAN ARRAYLIST
        ArrayList<Integer> inte = new ArrayList<Integer>();
        inte.add(10);
        inte.add(15);
        inte.add(20);
        inte.add(25);
        System.out.println(inte);

        System.out.println(" ");
        System.out.println("MEMBACA/MENGAKSES");
        System.out.println(inte.get(2));

        System.out.println(" ");
        System.out.println("MENGGANTI NILAI");
        System.out.println("Sebelum diganti" + inte);
        inte.set(0, 56);
        System.out.println("Sesudah diganti" + inte);
        System.out.println(" ");

        System.out.println("MENGHAPUS NILAI");
        System.out.println("sebelum di hapus");
        System.out.println(inte);
        System.out.println("sesudah di hapus");
        inte.remove(2);
        System.out.println(" ");

        System.out.println("MEMBACA UKURAN ArrayList");
        System.out.println(inte.size());
    }
}
