package SoalUKLSulit;

import java.util.Scanner;

public class soal3no1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int jumlahsiswa;
        int nilai = 0;
        double totalnilai =0;
        int total = 0;
        double ratarata;

        System.out.println("masukkan jumlah siswa: ");
        jumlahsiswa = s.nextInt();
        for (int i = 1; i <= jumlahsiswa; i++) {
            System.out.println("masukkan nilai siswa " + i + ":");
            nilai = s.nextInt();
            total += nilai;

        }

        ratarata =  total / jumlahsiswa;
        System.out.println("============================");
        System.out.println("total nilai: " + total);
        System.out.println("rata rata nilai: " + ratarata);
        System.out.println(totalnilai);

    }
}
