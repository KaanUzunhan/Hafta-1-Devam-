import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ival = new Scanner(System.in);
        int year;

        System.out.print("Yıl giriniz: ");
        year = ival.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.print(year + " Bir artık yıldır");
                } else {
                    System.out.print(year + " Bir artık yıl değildir");
                }
            } else {
                System.out.print(year + " Bir artık yıldır");
            }
        } else {
            System.out.print(year + " Bir artık yıl değildir");
        }
    }
}

