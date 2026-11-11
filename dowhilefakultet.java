public class dowhilefakultet {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        long sumDoWhile = 1;

        do {
            sumDoWhile *= i;
            i++;
        } while (i <= n);

        System.out.println("5! er " + sumDoWhile);
    }
}




