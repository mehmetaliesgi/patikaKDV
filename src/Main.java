import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar, kdvOran, kdvTutar, kdvliTutar;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen tutarı giriniz: ");
        tutar = input.nextDouble();

        Double total = (tutar > 1000) ? (kdvOran = 0.08) : (kdvOran = 0.18);

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;



        System.out.println("KDV'siz tutar: " + tutar);
        System.out.println("KDV oranı: " + kdvOran);
        System.out.println("KDV tutarı: " + kdvTutar);
        System.out.println("KDV'li tutar: " + kdvliTutar);

    }
}