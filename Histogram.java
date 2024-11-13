import java.util.Scanner;
public class Histogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int BesarArray = scan.nextInt();
        int []Apapun = new int[BesarArray];

        for (int i = 0; i < BesarArray; i++) {
            Apapun [i] = scan.nextInt();
        }

        int Maksimum = Apapun[0];
        for (int i = 0; i < BesarArray; i++) {
            if (Apapun [i] >= Maksimum) {
                Maksimum = Apapun[i];
            }
        }

        // for (int i = 0; i < Apapun.length; i++) {
        //     System.out.printf("Apapun[%d] ", Apapun[i]);
        //     for (int j = 0; j < Apapun[i]; j++) {
        //         System.out.print("[]");
        //     }
        //     System.out.println();
        // }

        /* 


        Apapun[3] = {5,3,1}

             0 1 2
        0    #
        1    #
        2    # #
        3    # #
        4    # # #

        */

        System.out.println();
        String Garis = "\u2500";
        for (int i = Maksimum; i >= -1; i--) {
            if (i > 0) {
                System.out.printf("%d |  ",i);
                for (int j = 0; j < Apapun.length; j++) {
                    if (i <= Apapun[j]) {
                        System.out.print("█ ");
                    }
                    // else if (i == 0) {
                    //     System.out.print("--");
                    // }
                    else {
                        System.out.print("  ");
                    }
                }
            }
            else if (i == 0) {
                System.out.printf("     ");
                for (int j = 0; j < Apapun.length; j++) {
                    System.out.print(Garis + Garis);
                }
            }
            else {
                System.out.printf("     ");
                for (int j = 0; j < Apapun.length; j++) {
                    System.out.printf("%d ", (j+1));
                }
            }
            System.out.println();
        }
        
    }
}
