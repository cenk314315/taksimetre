import java.util.Scanner;

public class hesaplama {



        public static void main(String[] args) {

            int mesafe;
            double tarife = 2.20, toplam ;



            Scanner input = new Scanner(System.in);
            System.out.print("Mesafeyi giriniz (KM): ");
            mesafe = input.nextInt();

            toplam = 10 + (mesafe * tarife);

            toplam = toplam < 20 ? 20 : toplam;
            System.out.print("Ödenecek Tutar:  " + toplam);


        }




}
