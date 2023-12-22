import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int Number,us;
        int total= 1 ;
        Scanner input=new Scanner (System.in);

        System.out.print("Sayı giriniz: ");
        Number= input.nextInt();
        System.out.print("Sayının Üssünü giriniz: ");
        us= input.nextInt();

        for (int i = 1 ; i <= us ; i++) {
            total *= Number;
        }System.out.println("Cevap: " + total);
    }
}