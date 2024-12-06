    import java.util.Scanner;

public class soal2Ukl3 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            boolean lanjut = true;
    
            System.out.println("Ayo kita mengerjakan quiz matematika!");
            System.out.println("Anda bisa mengetik 'selesai' jika ingin mengakhiri quiz.");
    
           
            while (lanjut) {
                int bil1 = (int) (Math.random() * 10) + 1; 
                int bil2 = (int) (Math.random() * 10) + 1; // math menghasilkan angka acak antar 0-1
                int operator = (int) (Math.random() * 3); 
    
                int jawabanBenar = 0; 
                String simbol = ""; 
    
                if (operator == 0) { 
                    simbol = "*";
                    jawabanBenar = bil1 * bil2;
                } else if (operator == 1) {
                    simbol = "/";
                    jawabanBenar = bil1 / bil2;
                    bil1 = bil2 * jawabanBenar; 
                } else if (operator == 2) { 
                    simbol = "%";
                    jawabanBenar = bil1 % bil2;
                }
    
                System.out.print(bil1 + " " + simbol + " " + bil2 + " = ");
                String jawaban = input.nextLine();

                if (jawaban.equalsIgnoreCase("keluar")) {
                    lanjut = false;
                    System.out.println("Terima kasih telah mengerjakan quiz!");
                    break;
                   
                }

                
                try {
                    int jawabanUser = Integer.parseInt(jawaban); //integerparseint = mengubah string jd int
                    if (jawabanUser == jawabanBenar) {
                        System.out.println("Jawaban Anda benar!");
                    } else {
                        System.out.println("Jawaban Anda salah. Yang benar adalah: " + jawabanBenar);
                    }
                } catch (NumberFormatException e) { //numerformat : mengonversi string yang tidak bisa menjadi angka
                    System.out.println("Jawaban harus berupa angka!");
                }
            }
    
        }
    }
    
        
        
    
    


    

