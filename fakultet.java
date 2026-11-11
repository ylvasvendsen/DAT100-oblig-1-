import static java.lang.Math.*;

public class fakultet {
    public static void main(String[] args) {

        int n = 3;
        int resultat = 1;

        for (int i = 1; i <= n; i++) {
            resultat = resultat * i;
        }

        System.out.println(n + "! er " + resultat);
    }
}



