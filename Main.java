public class Main {
    public static void main(String[] args) {
        int[] tab = {7,2,1,4};

        plukksortering(tab);

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]+" ");
        }
    }

    public static void plukksortering(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            int minstePos = i;
            for (int j=i+1; j < tab.length; j++) {
                if (tab[j] < tab[minstePos]) {
                    minstePos = j;
                }
            }
        }
    }
}


