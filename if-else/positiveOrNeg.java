import java.util.Scanner;

public class positiveOrNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String checkNum = (num>=0) ? "Positive" : "Negative";
        System.out.println(checkNum);
    }
    
}