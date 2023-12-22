import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner ival=new Scanner(System.in);
        System.out.print(" A Sayı değerlerini giriniz : ");
        a= ival.nextInt();
        System.out.print(" B Sayı değerlerini giriniz : ");
        c= ival.nextInt();
        System.out.print(" C Sayı değerlerini giriniz : ");
        b= ival.nextInt();

        int d= b*c;
        int e= d+a;
        int g= e-b;

        System.out.println("çıkan sonuç: "+ ++g );




    }
}
