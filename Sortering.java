public class Sortering {
    public static void main(String[] args) {
        int [] tab = {7,2,1,4};

        plukksortering(tab);

        //Skriver ut den sorterte tabellen

        for(int i = 0; i < tab.length;i++) {
            System.out.print(tab[i] + " ");
        }


    }
    public static void plukksortering(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            int minstePos = i;
                for (int j = i + 1; j < tab.length; j++) {
                if (tab[j] < tab[minstePos]) {
                    minstePos = j;
                }
            }
            // bytte om minst i usortert del med første i sortert del
            int tmp = tab[i];
            tab[i] = tab[minstePos];
            tab[minstePos] = tmp;
        }
    }
}
