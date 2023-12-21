import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        int başlangıç = input.nextInt();

        int k = 0;
        int b = 0;

        int i = 0;
        while (i <= başlangıç) {
            if (i % 3 == 0 && i % 4 == 0) {
                k += i;
                b++;
            }
            i++;
        }
        double average;
        if (b > 0) {
            average = (double) k / b;
            System.out.println("3 ve 4 tam bölünen sayıların ortalaması: " + average);

        } else {
            System.out.println("3 ve 4 e tam bölünen bir sayı bulunamadı");
        }
    }
}



