package SoalUKLSedang;

import java.util.Random;
import java.util.Scanner;

public class soal2no3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        System.out.println("       SELAMAT DATANG DI QUIZ MATEMATIKA");
        System.out.println("====================================================");
        System.out.println("jawab pertanyaan dengan benar");
        System.out.println("jika kamu ingin berhenti mnenghitung ketik 'selesai'");

        while (true) {
            // Menghasilkan 3 jenis operator: perkalian, pembagian, dan modulus
            int operatorChoice = r.nextInt(3);

            int num1 = r.nextInt(100) + 1;
            int num2 = r.nextInt(100) + 1;

            int correctAnswer = 0;
            String operator = "";

            switch (operatorChoice) {
                case 0: // Perkalian
                    operator = "x";
                    correctAnswer = num1 * num2;
                    break;
                case 1: // Pembagian
                    operator = "/";

                    while (num1 % num2 != 0) {
                        num2 = r.nextInt(50) + 1;
                    }
                    correctAnswer = num1 / num2;
                    break;
                case 2: // modulus
                    operator = "%";
                    correctAnswer = num1 % num2;
                    break;
            }

            // Menampilkan soal
            System.out.print(num1 + " " + operator + " " + num2 + " = ");
            String userAnswer = s.nextLine();

            if (userAnswer.equalsIgnoreCase("selesai")) {
                System.out.println("==========================================");
                System.out.println("terimakasih telah bermain dengan quiz kami");
                break;
            }

            try {
                int userAnswerInt = Integer.parseInt(userAnswer);
                if (userAnswerInt == correctAnswer) {
                    System.out.println("wow jawaban kamu benar");
                    System.out.println("");
                } else {
                    System.out.println("yahhh jawaban kamu salah, seharusnya jawabannya: " + correctAnswer);
                    System.out.println("");
                }
            } catch (NumberFormatException e) {
                System.out.println("error. ketik 'selesai' untuk berhenti menggunakan quiz.");
            }
        }

        s.close();

    }

}
