import java.util.Scanner;

public class soal1Ukl1{
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();
        System.out.println("Masukkan jarak tempuh (km): ");
        double jarak = input.nextDouble();
        System.out.println("Masukkan panjang paket (cm): ");
        double panjang = input.nextDouble();
        System.out.println("Masukkan lebar paket (cm): ");
        double lebar = input.nextDouble();
        System.out.println("Masukkan tinggi paket (cm): ");
        double tinggi = input.nextDouble();

        double volume = panjang*lebar*tinggi;


        double biayaJarak;
        if (jarak <= 10) {
            biayaJarak = berat * 4250;
        } else {
            biayaJarak = berat * 6000;
        }

        double biayaTambahan = 0;
        if (volume > 100) {
            biayaTambahan = 50000;
        }

        double totalBiaya = biayaJarak + biayaTambahan;

        System.out.println("Volume paket: " + volume + " cm");
        System.out.println("Biaya jarak: Rp " + biayaJarak);
        System.out.println("Biaya tambahan: Rp " + biayaTambahan);
        System.out.println("Total biaya pengiriman: Rp " + totalBiaya);
    }
}
