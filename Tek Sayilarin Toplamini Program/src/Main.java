import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int Number;
        int total = 0;
        Scanner input=new Scanner(System.in);


        do {
            System.out.print("Sayı giriniz: ");
            Number= input.nextInt();
            if ((Number %2 == 0) && (Number % 4 == 0)){
                total += Number;
            }
        }while (Number % 2 == 0);

        System.out.println("Total : "  + total);

    }
}
