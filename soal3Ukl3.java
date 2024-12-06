
    import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class soal3Ukl3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Masukkan jumlah angka: ");
        int jumlahAngka = scanner.nextInt();

        
        int[] angka = new int[jumlahAngka];

    
        System.out.println("Masukkan angka-angka:");
        for (int i = 0; i < jumlahAngka; i++) {
            angka[i] = scanner.nextInt();
        }

        
        Map<Integer, Integer> frekuensi = new HashMap<>();

        // Hitung frekuensi setiap elemen
        for (int num : angka) {
            frekuensi.put(num, frekuensi.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frekuensi kemunculan setiap angka:");
        for (Map.Entry<Integer, Integer> entry : frekuensi.entrySet()) {
            System.out.println(entry.getKey() + " muncul " + entry.getValue() + " kali");
        }
    }
}
    

