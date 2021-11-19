import java.util.Scanner;
public class Main {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.println("Masuk ke Sistem Parkir? y/n");
            char masuk = in.nextLine().charAt(0);

            if (masuk == 'y') {
                new SistemParkir();
            }
            if (masuk == 'n') {
                break;
            }

        }
    }
}
