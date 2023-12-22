import java.util.Scanner;
public class NotOrtalamasiHesapla {
    public static void main(String[] args) {
        //Değişkenleri oluştur
        int Matematik,Fizik,Kimya,Turkce,Tarih,Muzik;


        //Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz : ");
        Matematik = inp.nextInt();


        System.out.print("Fizik Notunuz : ");
        Fizik = inp.nextInt();


        System.out.print("Kimya Notunuz : ");
        Kimya = inp.nextInt();


        System.out.print("Türkce Notunuz : ");
        Turkce= inp.nextInt();


        System.out.print("Tarih Notunuz : ");
        Tarih = inp.nextInt();


        System.out.print("Müzik Notunuz : ");
        Muzik= inp.nextInt();

        int Toplam =(Matematik+Fizik+Kimya+Turkce+Tarih+Muzik);
        double Ortalamaniz = Toplam / 6.0E00;

        System.out.println ( Ortalamaniz >=60 ?"sınıfı geçtiniz":"sınıfta kaldınız");

    }
}
