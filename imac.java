import java.util.Scanner;

public class imac {

    public static void main(String args[]) {

        Scanner tastatur = new Scanner(System.in);

        String brukernavn = "Nybolig&Porsche";
        String passord = "Porsche&Nybolig";

        String bruker_navn = "";
        String password = "";



        do {
            System.out.print("Brukernavn? ");
            bruker_navn = tastatur.nextLine();

            System.out.print("Passord? ");
            password = tastatur.nextLine();
        } while (!bruker_navn.equals(brukernavn) || !passord.equals(password));

        System.out.println("Innlogga");

    }
}
