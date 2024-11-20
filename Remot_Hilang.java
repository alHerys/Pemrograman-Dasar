import java.util.Scanner;
public class Remot_Hilang {
    public static void main(String[] args) {
        int Channel_Baru = 1, Channel_Lama = 1, Volume = 50, Batas_Substring = 0, Hasil_Substring;
        boolean Status_TV = false;
        Scanner scan = new Scanner(System.in);
        String Pembuka = scan.nextLine();
        if (Pembuka.equals("POWER")) {
            Status_TV = !Status_TV;
            System.out.println("TV ON");
        }
        while (Status_TV) {
            String Masukan = scan.nextLine();
            if (Masukan.equals("POWER")) {
                Status_TV = !Status_TV;
                System.out.println("TV OFF");
            }
            else if (Masukan.equals("CHANNEL DOWN")) {
                Channel_Lama = Channel_Baru--;
                if (Channel_Baru < 1) {
                    System.out.println("Channel tidak valid");
                    ++Channel_Baru;
                }
                else {
                    System.out.printf("Channel sekarang: %d\n", Channel_Baru);
                }
            }
            else if (Masukan.equals("CHANNEL UP")) {
                Channel_Lama = Channel_Baru++;
                if (Channel_Baru > 30) {
                    System.out.println("Channel tidak valid");
                    --Channel_Baru;
                }
                else {
                    System.out.printf("Channel sekarang: %d\n", Channel_Baru);
                }
            }
            else if (Masukan.equals("VOLUME UP")) {
                Volume += 5;
                if (Volume > 100) {
                    System.out.println("Volume tidak valid");
                    Volume -= 5;
                }
                else {
                    System.out.printf("Volume sekarang: %d\n", Volume);
                }
            }
            else if (Masukan.equals("VOLUME DOWN")) {
                Volume -= 5;
                if (Volume < 1) {
                    System.out.println("Volume tidak valid");
                    Volume += 5;
                }
                else {
                    System.out.printf("Volume sekarang: %d\n", Volume);
                }
            }
            else if (Masukan.equals("MUTE")) {
                System.out.println("Volume mute");
            }
            else if (Masukan.equals("UNMUTE")) {
                System.out.printf("Volume sekarang: %d\n", Volume);
            }
            else if (Masukan.equals("PREV CHANNEL")) {
                Channel_Baru = Channel_Lama;
                System.out.printf("Channel sekarang: %d\n", Channel_Lama);
            }
            else {
                for (int i = Masukan.length()-1; i>=0; i--) {
                    if (Masukan.charAt(i)==' ') {
                        Batas_Substring = i;
                        break;
                    }
                }
                Hasil_Substring = Integer.parseInt(Masukan.substring(Batas_Substring + 1, Masukan.length()));
                if (Hasil_Substring > 100 || Hasil_Substring < 1) {
                    System.out.println("Channel tidak valid");
                }
                else {
                    Channel_Lama = Channel_Baru;
                    Channel_Baru -= Channel_Baru - Hasil_Substring;
                    System.out.printf("Channel sekarang: %d\n",Channel_Baru);
                }
            }
        }
        scan.close();
    }
}