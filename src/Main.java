import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int mesafe, yas, yolculukTipi;
        double kmbasi = 0.10, normalTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Mesafeyi (KM) Cinsinden Giriniz : ");
        mesafe = input.nextInt();

        System.out.print("Lütfen Yaşınızı Giriniz : ");
        yas = input.nextInt();

        System.out.print("Seyehatiniz tek yönlü ise => (1) Gidiş Dönüş ise => (2) : ");
        yolculukTipi = input.nextInt();

        normalTutar = (kmbasi * mesafe);

        double indirim1 = (normalTutar / 2);
        double indirim2 = (normalTutar - (normalTutar * 0.10));
        double indirim3 = (normalTutar - (normalTutar * 0.30));

        boolean kosul1 = (yolculukTipi >= 1 && yolculukTipi <= 2);
        boolean kosul2 = (mesafe > 0);
        boolean kosul3 = (yas > 0);

        if (kosul1 && kosul2 && kosul3) {
            if (yolculukTipi == 1) {
                if (yas < 12) {
                    System.out.println("Toplam Ödemeniz : " + indirim1);
                } else if (yas >= 12 && yas <= 24) {
                    System.out.println("Toplam Ödemeniz : " + indirim2);
                } else if (yas > 65) {
                    System.out.println("Toplam Ödemeniz : " + indirim3);
                }else{
                    System.out.println("Toplam Ödemeniz : " + normalTutar);
                }
            }
            if (yolculukTipi == 2) {
                if (yas < 12) {
                    System.out.println("Toplam Ödemeniz : " + (indirim1 - (indirim1 * 0.2)));
                }
                else if (yas >= 12 && yas <= 24){
                    System.out.println("Toplam Ödemeniz : " + (indirim2-(indirim2 * 0.20)) * 2);
                }
                else if (yas > 65){
                    System.out.println("Toplam Ödemeniz : " + (indirim3-(indirim3*0.2)));
                }else{
                    System.out.println("Toplam Ödemeniz : " + (normalTutar-(normalTutar*0.2)));
                }
            }

            System.out.println("İyi Yolculuklar Dileriz. :)");


        }else{
            System.out.println("Hatalı Veri Girişi Yaptınız! :(");
        }


    }
}




