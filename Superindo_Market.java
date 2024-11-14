import java.util.Scanner;
public class Superindo_Market {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("════════════════════════════════════════════════════════");      
        System.out.println("            SELAMAT DATANG DI SUPERINDO MART            ");
        System.out.println("                  SELAMAT BERBELANJA ;)                 ");
        System.out.println("════════════════════════════════════════════════════════");

        int KodeBuah_dan_Harganya [][] = {{1,2,3,4,5,6},
                                          {25000,15000,8000,19000,50000,10000}};
        String Nama_Buah [] = {"Apel","Mangga","Jeruk","Anggur","Pisang","Alpukat"};
        int Harga_Total = 0;
        boolean Status = true;

        while (Status) {
            System.out.print(" Silahkan masukkan kode buahnya: ");
            byte kode_buah = scan.nextByte();

            if (kode_buah > 6 || kode_buah < 1) {
                System.out.print(" Sepertinya kode buah kamu gak ada, coba lagi yahh...\n");
                System.out.println();
                continue;
            }

            System.out.print(" Silahkan masukkan berat buahnya: ");
            int Berat_Buah = scan.nextInt();

            System.out.printf("\n Buah: %s\n",Nama_Buah[kode_buah-1]);
            System.out.printf(" Berat: %d kg\n", Berat_Buah);
            System.out.printf(" Harga Buah/kg: Rp %d\n", KodeBuah_dan_Harganya[1][kode_buah-1]);
            System.out.printf("\n Subtotal: Rp %d\n",(KodeBuah_dan_Harganya[1][kode_buah-1]*Berat_Buah));
            Harga_Total += KodeBuah_dan_Harganya[1][kode_buah-1]*Berat_Buah;

            System.out.print("\n Lanjutkan pembelian?\n 1. Iya\n 2. Tidak\n Pilih angka 1 atau 2: ");
            byte Pilihan = scan.nextByte();
            System.out.println();

            if (Pilihan == 2) {
                Status = false;
            }
        }
        scan.close();
        System.out.printf(" Total pembelian anda adalah Rp %d\n",Harga_Total);
        System.out.println("════════════════════════════════════════════════════════");    
        System.out.println("            TERIMA KASIH TELAH BERBELANJA DI            ");
        System.out.println("                    SUPERINDO MART :)                   ");
        System.out.println("════════════════════════════════════════════════════════");
    }
}