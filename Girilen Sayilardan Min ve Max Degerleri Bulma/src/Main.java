import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    int n1, n2, min=0, max=0;
    System.out.print("kaç tane tam sayı gireceksiniz: ");
    n1= input.nextInt();

    System.out.print("1. sayı: ");
    n2=input.nextInt();
    max=n2;
    min=n2;

    for (int i=2;i<=n1;i++){
        System.out.print(i + ". sayı: ");
        n2=input.nextInt();

        if (n2>=max){
            max=n2;

        }else if (n2<=min){
            min=n2;
        }
    }
    System.out.println("Büyük sayı : " + max);
    System.out.println("Küçük sayı :" + min);








    }
}