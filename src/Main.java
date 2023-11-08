import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int zycia = 3;
        int wynik = 0;

        ArrayList arrayList = new ArrayList<>();
        arrayList.add("exit");
        arrayList.add("Kamień");
        arrayList.add("Nozyczki");
        arrayList.add("Papier");

        Scanner in = new Scanner(System.in);

        while (zycia>0) {
            System.out.println(" 1.Kamień \n 2.Nozyczki \n 3.Papier \n 0.exit");
            int wyborGracza = in.nextInt();
            Random random = new Random();
            int przeciwnik = random.nextInt(3) + 1;
            if (wyborGracza == przeciwnik) {
                System.out.println(" Remis nie tracisz zycia");
            } else if (wyborGracza == 1 && przeciwnik == 2) {
                System.out.println(" Wygrałes zdobywasz punkt");
                wynik +=1;
                System.out.println(" Aktualny wynik: " + wynik);

            } else if (wyborGracza == 1 && przeciwnik == 3) {
                System.out.println(" Przegrałes tracisz zycie");
                zycia -=1;
                System.out.println(" Twoja zycia: " + zycia);
            } else if (wyborGracza == 2 && przeciwnik == 3) {
                System.out.println(" Wygrałes zdobywasz punkt");
                wynik +=1;
                System.out.println(" Aktualny wynik: " + wynik);
            } else if (wyborGracza == 2 && przeciwnik == 1) {
                System.out.println(" Przegrałes tracisz zycie");
                zycia -=1;
                System.out.println(" Twoja zycia: " + zycia);
            } else if (wyborGracza == 3 && przeciwnik == 1) {
                System.out.println(" Wygrałes zdobywasz punkt");
                wynik +=1;
                System.out.println(" Aktualny wynik: " + wynik);
            } else if (wyborGracza == 3 && przeciwnik == 2) {
                System.out.println(" Przegrałes tracisz zycie");
                zycia -=1;
                System.out.println(" Twoja zycia: " + zycia);
            }
            else{
                System.out.println(" Game over\n twój wynik to: " + wynik);
                break;
            }
            System.out.println(" Przeciwnik wybrał: " + arrayList.get(przeciwnik));
            System.out.println(" Wynik: " + wynik);
            System.out.println(" Zycia: " + zycia);
        }

    }
}