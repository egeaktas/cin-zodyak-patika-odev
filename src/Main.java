import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil, kalan;
        String zodyak;
        System.out.print("yıl gir: ");
        yil = input.nextInt();
        kalan = yil%12;

        switch (kalan) {
            case 0:  zodyak = "maymun";
                System.out.println("zodyak: "+zodyak);
                break;
            case 1:  zodyak = "horoz";
                System.out.println("zodyak: "+zodyak);
                break;
            case 2:  zodyak = "köpek";
                System.out.println("zodyak: "+zodyak);
                break;
            case 3:  zodyak = "domuz";
                System.out.println("zodyak: "+zodyak);
                break;
            case 4:  zodyak = "fare";
                System.out.println("zodyak: "+zodyak);
                break;
            case 5:  zodyak = "öküz";
                System.out.println("zodyak: "+zodyak);
                break;
            case 6:  zodyak = "kaplan";
                System.out.println("zodyak: "+zodyak);
                break;
            case 7:  zodyak = "tavşan";
                System.out.println("zodyak: "+zodyak);
                break;
            case 8:  zodyak = "ejderha";
                System.out.println("zodyak: "+zodyak);
                break;
            case 9:  zodyak = "yılan";
                System.out.println("zodyak: "+zodyak);
                break;
            case 10:  zodyak = "at";
                System.out.println("zodyak: "+zodyak);
                break;
            case 11:  zodyak = "koyun";
                System.out.println("zodyak: "+zodyak);
                break;
        }
    }
}