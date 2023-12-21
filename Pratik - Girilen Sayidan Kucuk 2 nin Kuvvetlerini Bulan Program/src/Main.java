import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Number;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        Number = input.nextInt();

        for (int i = 1; i <= Number; i *= 4)
            System.out.println("4`Sayısının kuvvetleri: " + i);

        for (int i = 1; i <= Number; i *= 5)
            System.out.println("5`Sayısının kuvvetleri: " + i);
    }
}

