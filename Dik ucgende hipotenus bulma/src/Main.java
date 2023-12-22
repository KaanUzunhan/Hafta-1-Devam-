import java.util.Scanner;
public class Main {
          //Değişkenleri oluşturalım

    public static void main(String[] args) {
        int a,b;
        double c;
                   //kullanıcıdan veri alma
        Scanner girdi=new Scanner(System.in);
        System.out.print("1.kenarı giriniz");
        a=girdi.nextInt();
        System.out.print("2 kenarı giriniz");
        b=girdi.nextInt();

        c= Math.sqrt((a*a) + (b*b));
        System.out.println("hipotenüs ;" + c);
    }
}