import java.util.Scanner;

public class binCoeff {

    public static int factoril(int n){
        if(n==0){
            return 1;
        }
        int prevfact = factoril(n-1);
        return n*prevfact;
    }

    public static int binCoeff(int n, int r) {
        int nFact = factoril(n);
        int rFact = factoril(r);
        int nmrFact = factoril(n-r);
        int bc = nFact/(rFact*nmrFact); 
        return bc;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(binCoeff(n, r));
    }
}