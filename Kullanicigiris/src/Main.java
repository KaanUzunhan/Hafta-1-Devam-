import javax.swing.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String userName, password, şifre;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adını giriniz : ");
        userName = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals("Kaanuzunhan") && password.equals("Patika123")) {
            System.out.println("Giriş Yaptınız ! "); //
        } else {
            System.out.println("Kullanıcı adınız ve  şifreniz yanlış!!");
        }
        String avil;
        System.out.print("şifrenizi Değiştirmek: ");
        avil = input.nextLine();

        if (avil.equals("Patika123")) {
            System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
        } else {
            System.out.print("Şifre oluşturuldu");
        }


    }
}