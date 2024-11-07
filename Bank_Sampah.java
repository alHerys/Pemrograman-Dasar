import java.util.Scanner;
public class Bank_Sampah {
    
    private static Scanner scan = new Scanner (System.in);
    private static byte Pilihan;

    public static void main(String[] args) {
        SelamatDatang();
        while (true) {
            byte login = scan.nextByte();
            scan.nextLine();
            if (login > 3 || login < 1) {
                System.out.print("\nPilihan angka tidak tersedia, pastikan pilihan anda benar.\nMasukkan angka 1,2, atau 3 sesuai keperluan anda:");
                continue;
            }
            switch (login) {
                case 1:
                MenuNasabah();
                break;
                case 2:
                
                break;
                case 3:
                
                break;
            }
            break;
        }
    }

    // Method pembuka aplikasi selamat datang
    public static void SelamatDatang() {
        System.out.println("\n=================================================");        
        System.out.println("------------- BANK SAMPAH FILKOM -------------");
        System.out.println("=================================================");
        System.out.println("Selamat datang di aplikasi Bank Sampah FILKOM");
        System.out.println("Silahkan cantumkan opsi sesuai keperluan anda:");
        System.out.print("1. Nasabah\n2. Pengelolah Sampah\n3. Admin Bank Sampah Brawijaya\n");
        System.out.print("Masukkan angka 1, 2, atau 3 sesuai keperluan anda: ");
    }

    // Method untuk menangani pilihan registrasi nasabah
    public static void MenuNasabah() {
        System.out.println("\nSilahkan mengisih data diri anda:");
        System.out.print("Nama: ");
        String Nama = scan.nextLine();
        System.out.print("NIM: ");
        String NIM = scan.nextLine();
        System.out.println("\n|------------- MENU NASABAH -------------|");
        System.out.printf("Haloo %s...\nSilahkan pilih opsi menurut kebutuhan anda\n", Nama);
        System.out.println("1. Menabung\n2. Informasi Akun\n3. Belanja\n4. Jenis Bank Sampah yang diterima\n5. Keluar");
        while (true) {
            System.out.print("Pilihan: ");
            Pilihan = scan.nextByte();
            scan.nextLine();
            if (Pilihan > 5 || Pilihan < 1) {
                System.out.println("Pilihan tidak ada");
                continue;
            }
            switch (Pilihan) {
                case 1:
                    NasabahMenabung();
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
            }
            if (Pilihan == 5) {
                break;
            }
        }               
    }

    // Method untuk pilihan Menabung Nasabah
    public static void NasabahMenabung() {
        int totalPendapatan = 0;
        System.out.println("\nJenis sampah: ");
        String JenisSampah [] = {"Organik" , "Anorganik", "Sampah Daur Ulang", "B3", "Residu"};
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d. %s\n",(i+1),JenisSampah[i]);
        }
        while (true) {
            System.out.print("Silahkan pilih jenis sampah anda: ");
            Pilihan = scan.nextByte();
            if (Pilihan < 1 || Pilihan > 5) {
                System.out.println("Pilihan tidak ada. Pastikan pilihan anda tersedia\n");
                continue;
            }
            System.out.print("Berat Sampah (dalam kg): ");
            int BeratSampah = scan.nextInt();
            int [] HargaSampahPerKg = {3000,5000,7000,4000,6000};
            switch (Pilihan) {
                case 1:
                    // HargaSampahPerKg = 3000;
                    totalPendapatan += HargaSampahPerKg [0] * BeratSampah;
                    System.out.printf("Sampah anda : %s dengan berat %dkg", JenisSampah[0],HargaSampahPerKg [0]);
                    break;
                case 2:
                    // HargaSampahPerKg = 3000;
                    totalPendapatan += HargaSampahPerKg [1] * BeratSampah;
                    System.out.printf("Sampah anda : %s dengan berat %dkg", JenisSampah[1],HargaSampahPerKg [1]);
                    break;
                case 3:
                    // HargaSampahPerKg = 3000;
                    totalPendapatan += HargaSampahPerKg [2] * BeratSampah;
                    System.out.printf("Sampah anda : %s dengan berat %dkg", JenisSampah[2],HargaSampahPerKg [2]);
                    break;
                case 4:
                    // HargaSampahPerKg = 3000;
                    totalPendapatan += HargaSampahPerKg [3] * BeratSampah;
                    System.out.printf("Sampah anda : %s dengan berat %dkg", JenisSampah[3],HargaSampahPerKg [3]);
                    break;
                case 5:
                    // HargaSampahPerKg = 3000;
                    totalPendapatan += HargaSampahPerKg [4] * BeratSampah;
                    System.out.printf("Sampah anda : %s dengan berat %dkg", JenisSampah[4], HargaSampahPerKg [4]);
                    break;
            }
            System.out.println("\nTambahkan Sampah Lagi?");
            System.out.print("1. Iya\n2. Tidak\nPilihan: ");
            Pilihan = scan.nextByte();
            System.out.println();
            if (Pilihan == 2) {
                System.out.printf("Anda memperoleh Rp %d\nTerima kasih telah menabung di bank sampah FILKOM",totalPendapatan);
                break;
            }
        }
    }
}
