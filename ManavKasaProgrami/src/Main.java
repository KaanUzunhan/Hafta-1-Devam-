import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double  armut=2.14;
        double  elma =3.67;
        double  domates=1.11;
        double  muz=0.95;
        double  patlıcan=5.00;

        Scanner inp=new Scanner(System.in);
        System.out.print("Armut kaç kilo? : ");
        double armutkg=inp.nextDouble();
        System.out.print("Elma kaç kilo? : ");
        double elmakg=inp.nextDouble();
        System.out.print("Domates kaç kilo? : ");
        double dometeskg=inp.nextDouble();
        System.out.print("Muz kaç kilo? : ");
        double muzkg=inp.nextDouble();
        System.out.print("Patlıcan kaç kilo? : " );
        double patlıcankg=inp.nextDouble();

        double fiyat=armutkg*armut;
        double fiyat1=elmakg*elma;
        double fiyat2=dometeskg*domates;
        double fiyat3=muzkg*muz;
        double fiyat4=patlıcankg*patlıcan;

        double toplam=(fiyat1+fiyat2+fiyat+fiyat3+fiyat4);
        System.out.println("Toplam Tutar: " + toplam);
       }
    }
