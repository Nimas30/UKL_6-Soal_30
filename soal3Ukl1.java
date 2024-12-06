import java.util.Scanner;

public class soal3Ukl1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int jumlahSiswa;
        double totalNilai, nilai, rataRata = 0;
        
        System.out.println("Masukkan jumlah siswa: ");
        jumlahSiswa = s.nextInt(); 

        double total = 0;  

        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.println("Masukkan nilai siswa " + i + ":");
            nilai = s.nextDouble();  
            total += nilai;  // Menambahkan nilai siswa ke total
        }

        rataRata = total / jumlahSiswa;  

        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata nilai: " + rataRata);
    }
}

    

