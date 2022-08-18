import java.util.Scanner;

public class sumOfNatural {
    Scanner sc = new Scanner(System.in);
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("The sum of natural numbers from 1 to " + num + " is " + sum);
    }
}
