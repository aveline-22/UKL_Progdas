import java.util.Scanner;

public class soal1no1 {
    public static void main(String[] args) {
    //tambah tipe data dan variabel
        Scanner s = new Scanner(System.in);
        String namapaket;
        double biayakg = 0;
        double biayaPengiriman;
        double panjang, lebar, tinggi;
        double berat;
        double jarak;
        double volume;
        double hargavolume = 0;

        System.out.println("========================================");
        System.out.println("     SELAMAT DATANG DI TA EKSPRESS\nberikut adalah pricelist pengiriman kami");
        System.out.println("========================================");
        System.out.println(
                "     1. jarak > 10 km = Rp.6.000\n     2. jarak < 10 km = Rp.4.250\n     3. volume > 100 cm = Rp.50.000\n     4. volume < 100 cm = Rp.0 ");
        System.out.println("");
        System.out.print("inputkan nama barang: ");
        namapaket = s.nextLine();
        System.out.print("inputkan berat barang(kg): ");
        berat = s.nextDouble();
        System.out.print("inputkan jarak tempuh pengiriman paket(km): ");
        jarak = s.nextDouble();
        System.out.print("inputkan panjang paket(cm): ");
        panjang = s.nextDouble();
        System.out.print("inputkan lebar paket(cm): ");
        lebar = s.nextDouble();
        System.out.print("inputkan tinggi paket(cm): ");
        tinggi = s.nextDouble();
        System.out.println("=============================================");

        //menghitung volume dengan rumus (PxLxT)
        volume = panjang * lebar * tinggi;

        // biaya jarak
       if (jarak>10) {
        biayakg = berat*6000;   
       }else if (jarak<=10) {
        biayakg =berat* 4250;
        
       }
       // biaya volume 
       if (volume>100) {
        hargavolume = 50000;  
       }else if (volume<=100) {
        hargavolume = 0;
        
       }
        biayaPengiriman = biayakg + hargavolume;

        System.out.println("=====RINCIAN PENGIRIMAN=====");
        System.out.println("nama barang: "+namapaket);
        System.out.println("berat paket: " + berat + " kg");
        System.out.println("jarak tempuh: "+ jarak+ " km");
        System.out.println("volume paket: "+volume+ " cm");
        System.out.println("biaya berat: "+biayakg);
        System.out.println("biaya vulume: "+ hargavolume);
        System.out.println("total biaya pengiriman: "+ biayaPengiriman);

        
        

    }

}
