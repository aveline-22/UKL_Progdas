package SoalUKLSedang;

import java.util.Scanner;

public class soal2no1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int nilai;

        System.out.println("masukkaan  nilai bulat positif: ");
        nilai = s.nextInt();
        if (nilai < 0) {
            System.out.println("SYSTEM ERROR. anda harus memasukkan nilai bulat positif");
        } else if (nilai > 0) {
            long faktorial = 1;
            for (int i = 1; i <= nilai; i++) {
                faktorial *= i;
            }
            System.out.println("Faktorial dari " + nilai + " adalah " + faktorial);

        }
        s.close();

    }

}
