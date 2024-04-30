package Lesson19;
import java.util.Scanner;

public class SFmain {
    public static void main(String[] args) {
        while (true) {
            try {

                Scanner scanner = new Scanner(System.in);
                while (true) {
                    System.out.println("Ayı daxil edin:");
                    String input = scanner.nextLine();
                    if (input.equalsIgnoreCase("Çıxış")) {
                        System.out.println("Proqramdan çıxılır...");
                    }

                    SeaonFinder.Month month = SeaonFinder.Month.valueOf(input);
                    switch (month) {
                        case DEKABR:
                        case YANVAR:
                        case FEVRAL:
                            System.out.println("Qış fəslidir");
                            break;
                        case MART:
                        case APREL:
                        case MAY:
                            System.out.println("Yaz fəslidir");
                            break;
                        case IYUN:
                        case IYUL:
                        case AVQUST:
                            System.out.println("Yay fəslidir");
                            break;
                        case SENTYABR:
                        case OKTYABR:
                        case NOYABR:
                            System.out.println("Payız fəslidir");
                            break;
                    }
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Yanlış daxil etdiniz");
            }
        }
    }
}
