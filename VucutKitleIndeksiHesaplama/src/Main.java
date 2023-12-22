import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double boy,kilo;
        Scanner inp=new Scanner(System.in);
        System.out.print("Boyunuzu M cinsinden Yazınız: ");
        boy=inp.nextDouble();
        System.out.print("KİLONUZU KG cinsinden Yazınız: ");
        kilo= inp.nextDouble();

        double vucütkitle = kilo / (boy*boy);
        System.out.println("Vücut Kitle Endeksiniz: " + vucütkitle);

    }
}