import java.util.Scanner;
public class deneme {
    public static void main(String[] args){
        int km;
        double perkm = 2.20,total,startprice=10;
        Scanner input = new Scanner(System.in);
        System.out.print("KM cinsinden mesafeyi yazınız; ");
        km=input.nextInt();

        total=(perkm*km);
        total += startprice;

        total=(total<20) ? 20: total;
        System.out.println("Toplam Tutar : " +total);

    }

}
