import java.util.Scanner;

public class soal2Ukl1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = s.nextInt();

        if (bilangan < 0) {
            System.out.println("Bilangan harus positif!");
        } else {
            long faktorial = 1;
            for (int i = 1; i <= bilangan; i++) {
                faktorial = faktorial* i;
            }
            System.out.println("Faktorial dari " + bilangan + " adalah: " + faktorial);
        }

       
    }
  
}

    

