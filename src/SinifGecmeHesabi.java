import java.util.Scanner;

public class SinifGecmeHesabi {
    /* Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
    Geçme Notu : 55
    Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın. */
    public static void main(String[] args) {
        double mat, fizik, kimya, turkce, muzik, toplam = 0;
        int dersSayisi = 5;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz:");
        mat = inp.nextDouble();

        System.out.print("Fizik Notunuz:");
        fizik = inp.nextDouble();

        System.out.print("Kimya Notunuz:");
        kimya = inp.nextDouble();

        System.out.print("Türkçe Notunuz:");
        turkce = inp.nextDouble();

        System.out.print("Müzik Notunuz:");
        muzik = inp.nextDouble();

        if (mat <= 100 && mat > 0) {
            toplam = toplam + mat;
        } else {
            dersSayisi = dersSayisi - 1;
        }
        if (fizik <= 100 && fizik > 0) {
            toplam = toplam + fizik;
        } else {
            dersSayisi = dersSayisi - 1;
        }
        if (kimya <= 100 && kimya > 0) {
            toplam = toplam + kimya;
        } else {
            dersSayisi = dersSayisi - 1;
        }
        if (turkce <= 100 && turkce > 0) {
            toplam = toplam + turkce;
        } else {
            dersSayisi = dersSayisi - 1;
        }
        if (muzik <= 100 && muzik > 0) {
            toplam = toplam + muzik;
        } else {
            dersSayisi = dersSayisi - 1;
        }

        double ortalama = (toplam / dersSayisi);

        System.out.println("Ortalamanız:" + ortalama);

        if (ortalama >= 55) {
            System.out.println("Sınıfı Geçtiniz!");
        } else {
            System.out.println("Sınıfta Kaldınız!");
        }


    }
}
