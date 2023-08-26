import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişken
        double kdvsiz_fiyat;
        double kdv_18=1.18;
        double kdv_8=1.08;

        //Scanner sınıfı
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan fiyat bilgisi al
        System.out.print("Fiyat bilgisini giriniz : ");
        kdvsiz_fiyat = input.nextDouble();
        double gecerli_kdv= kdvsiz_fiyat<=1000 ? kdv_18 : kdv_8;

        double kdvli_fiyat = kdvsiz_fiyat *gecerli_kdv;
        double kdv_tutari = kdvli_fiyat-kdvsiz_fiyat;


        System.out.println("kdv'li fiyat " + kdvli_fiyat);
        System.out.println("kdv tutarı " + kdv_tutari);
        System.out.println("kdv oranı " + (gecerli_kdv==1.18 ? "%18" : "%8"));
        System.out.println("kdv'siz fiyat " + kdvsiz_fiyat);

    }
}