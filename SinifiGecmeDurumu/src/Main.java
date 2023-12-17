import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fiz, kim, müz, turkce;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz : ");
        fiz = input.nextInt();

        System.out.print("kimya notunuz : ");
        kim = input.nextInt();

        System.out.print("Müzik notunuz : ");
        müz = input.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();


        if ((0 <= mat && mat <= 100)
                && (0 <= fiz && fiz <= 100)
                && (0 <= kim && kim <= 100)
                && (0 <= müz && müz <= 100)
                && (0 <= turkce && turkce <= 100)) {


            double Total = (mat + fiz + kim + müz + turkce) / 5;

            System.out.println("Ortalamanız : " + Total);

            if (Total <= 55) {
                System.out.println("Sınıf Tekrarı!!");
            } else {
                System.out.println("Sınıfı geçtiniz tebrikler");
            }
        } else {
            System.out.println("Hatalı not girişi yaptınız lütfen ders notunuzu 0 ila 100 arasında olduğundan emin olunuz.");


        }

    }
}