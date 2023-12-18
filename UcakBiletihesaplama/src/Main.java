import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double yaş, km, fiyatlandırma = 0.10;
        int seçme;

        Scanner input = new Scanner(System.in);

        System.out.print("Yolcu yaşını giriniz: ");
        yaş = input.nextInt();

        System.out.print("Mesafeyi Giriniz: ");
        km = input.nextInt();

        System.out.println("Yolculuk tipini seçin = \n)1-Tek yön \n)2-Gidiş dönüş : ");
        seçme = input.nextInt();

        fiyatlandırma *= km;

        if (km >= 0) {

        } else {
            System.out.println("Hatalı Giriş Yaptınız");
        }


        switch (seçme) {

            case 1:
                if (yaş < 12) {
                    fiyatlandırma *= 0.5;
                    System.out.println("Ödemeniz gereken tutar: " + fiyatlandırma + "Tl dir.");
                } else if (yaş <= 24) {
                    fiyatlandırma *= 0.9;
                    System.out.println("Ödemeniz gereken tutat: " + fiyatlandırma + "TL dir.");

                } else if (yaş > 65) {
                    fiyatlandırma *= 0.7;
                    System.out.println("Ödemeniz gereken tutar: " + fiyatlandırma + "Tl dir.");
                } else {
                    System.out.println("Ödenecek tutar:" + fiyatlandırma + "Tl dir.");
                }
                break;

            case 2:
                if (yaş < 12) {
                    fiyatlandırma *= 0.5 * 0.8 * 2;
                    System.out.println("Ödemeniz gereken tutar: " + fiyatlandırma + "Tl dir.");
                } else if (yaş <= 24) {
                    fiyatlandırma *= 0.9 * 0.8 * 2;
                    System.out.println("Ödemeniz gereken tutar: " + fiyatlandırma + "Tl dir.");
                } else if (yaş > 65) {
                    fiyatlandırma *= 0.7 * 0.8 * 2;
                    System.out.println("Ödemeniz gereken tutar: " + fiyatlandırma + "Tl dir.");
                } else {
                    fiyatlandırma *= 0.8 * 2;
                    System.out.println("Ödemeniz gereken tutar: " + fiyatlandırma + "Tl dir.");
                }
                break;
            default:
                System.out.println("Lütfen doğru giriş sağlayın");


        }
    }

}
