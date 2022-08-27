import java.util.Scanner;

public class primeInRange {

    public static boolean isPrime(int n) {
        Boolean flag = true;
        if(n==1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void primeInRange(int n) {

        for (int i = 2; i <= n; i++) {
            System.out.print(isPrime(i) ? (i + " ") : "");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        primeInRange(10);
    }
}
