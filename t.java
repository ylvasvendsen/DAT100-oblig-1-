public class t {
    public static void main(String[] args) {

        int[] t = {7, 2, 1, 4};

        int lengde = t.length;

        int[] nyt = new int[lengde];

        for (int tNr = 0; tNr < lengde; tNr++) {
            int minPos = 0; //Minimum på 0 - plassen?

            for (int posNr = 1; posNr < lengde; posNr++)
                if (t[posNr] < t[minPos])
                    minPos = posNr;
            // Nå er minste verdi
            nyt[tNr] = t[minPos];

            // Sletter minimumsverdien

            t[minPos] = Integer.MAX_VALUE;

        }

        t = nyt;  // Tall-tabellen er sortert

        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " "); // Vil skrive ut: 1 2 4 7
        }
    }
}
