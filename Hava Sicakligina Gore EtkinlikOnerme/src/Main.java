import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
           int heat;
           Scanner input=new Scanner(System.in);
           System.out.print("Sıcaklık giriniz; ");
           heat=input.nextInt();

           if (heat < 5){
               System.out.println("Kayak Yapabilirsiziniz.");

           } else if (heat<25){
               System.out.println("Sinema veya pikniğe gidebilirsiniz.");
           }
           if (heat>25){
               System.out.println("Yüzmek için denize veya havuza gidebilirsiniz");
           }
    }
}