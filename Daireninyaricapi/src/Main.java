import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int r;
        double pi=3.14;
        Scanner inp= new Scanner(System.in);
        System.out.print("Dairenin yarı Çapını Giriniz; ");
        r= inp.nextInt();

        double ALAN = pi * r * r;
        double CEVRE=2 * pi * r;

        System.out.println("Dairenin alanı :" + ALAN);
        System.out.println("Dairenin Cevresi:" + CEVRE);

    }
}