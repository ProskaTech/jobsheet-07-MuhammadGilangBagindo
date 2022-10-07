package jobsheet7;

/**
 *
 * Created by 21343030_Muhammad Gilang Bagindo
 */

import java.util.Scanner;

public class Tugas1a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda : ");
        String nama = in.nextLine();
        int jumlah;
        for (jumlah = 0; jumlah < 10; jumlah += 1)
            System.out.println(nama);
    }
}
