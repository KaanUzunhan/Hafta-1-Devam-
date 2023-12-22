import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,b,c=1,d=1,a=1;

    Scanner input=new Scanner(System.in);

    System.out.print("Kaç eleman var: ");
    n= input.nextInt();

    System.out.print("Kaç elemanlı bir gurup istiyorsun: ");
    b= input.nextInt();

    for (int i=1; i<=n; i++){
        c *=i;
    }

    for (int i=1; i<=b;i++){
        d*=i;
    }

    for (int i=1; i<=(n-b);i++){
        a*=i;
    }

     double total = c/(d * a);

    System.out.println("C(n,r)=" + total);

    }
}
