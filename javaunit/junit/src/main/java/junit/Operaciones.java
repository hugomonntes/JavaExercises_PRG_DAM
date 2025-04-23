package junit;

public class Operaciones {
    public static int factorial(int n) {
        int res = 0;
        for (int i = 1; i < n; i++) {
            res *= i;
        }
        return res;
    }

    public static boolean primo(int n) {
        boolean esPrimo = true;
        for (int i = 2; i < n; i++)
            if (n % i == 0) {
                esPrimo = false;
            } else {
                esPrimo = true;
            }
        return esPrimo;
    }
}
