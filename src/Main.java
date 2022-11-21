import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //DEĞİŞKENLER
        double km,tarife,tutar;
        int baslangic, indiBindi;

        tarife = 2.20;
        indiBindi = 20;
        baslangic = 10;

        //GİRDİLER
        Scanner input = new Scanner(System.in);

        System.out.println("TAKSİMETRE HESAPLAYICIYA HOŞGELDİNİZ!");
        System.out.println("MESAFEYİ GİRİNİZ: ");
        km = input.nextDouble();

        tutar = (km * tarife);
        double topTutar = tutar > 0 & tutar < 20 ? tutar = 20  : (km * tarife) + baslangic;

        System.out.println("ÜCRET: " + (topTutar));

    }
}

//double kdvliTutar = tutar > 0 & tutar < 1000 ? (tutar * kdvOran ) / 100  : (tutar * kdvOran2 ) / 100;