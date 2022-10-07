package jobsheet7;

import java.util.Scanner;

/**
 *
 * Created by 21343030_Muhammad Gilang Bagindo
 */

public class Tugas1b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda : ");
        String nama = in.nextLine();
        int jumlah = 0;

        while (jumlah < 10) {
            System.out.println(nama);
            jumlah++;
        }
    }
}
