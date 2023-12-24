import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N1, N2;
        int ebob = 1;
        int ekok = 1;

        System.out.print("1. Sayıyı giriniz: ");
        N1 = input.nextInt();

        System.out.print("2.Sayıyı Giriniz: ");
        N2 = input.nextInt();

        if (N1 <= N2) {
            while (ekok <= N1) {
                if (N1 % ekok == 0 && N2 % ekok == 0) {
                    ebob = ekok;
                }
                ekok++;
            }

            System.out.println("Girilen sayıların Ebobu: " + ebob);
            System.out.println("Girilen sayıların Ekoku: " + (N1 * N2) / ebob);
        } else {
            while (ebob <= N2) {
                if (N1 % ekok == 0 && N2 % ekok == 0) {
                    ebob = ekok;
                }
                ekok++;
            }
            System.out.println("Girilen sayıların Ebobu: " + ebob);
            System.out.println("Girilen sayıların Ekoku: " + (N1 * N2) / ebob);
        }
    }
}
