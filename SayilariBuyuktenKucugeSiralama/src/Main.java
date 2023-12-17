import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c;

        Scanner ival = new Scanner(System.in);

        System.out.print("a sayısını giriniz : ");
        a = ival.nextDouble();

        System.out.print("b sayısını giriniz: ");
        b = ival.nextDouble();

        System.out.print("c Sayısını giriniz: ");
        c = ival.nextDouble();

        if ((a > b) && (a > c)){
            if (b > c) {
                System.out.print("a > b > c");
            } else {
                System.out.print("a > c > b");
            }

        }else if ((b>a) && (b>c)){
            if (a>c){
                System.out.print("b > a > c");
            }else {
                System.out.print("b > c > a");
            }

        }else{
            if (a > b){
                System.out.print("c > a > b");

            }else {
                System.out.print("c > b < a");
            }
        }
    }
}

