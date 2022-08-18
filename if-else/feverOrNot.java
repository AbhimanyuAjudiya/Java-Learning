import java.util.Scanner;

public class feverOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        String checkTemp = (temp>=100) ? "You have a fever" : "You don't have a fever";
        System.out.println(checkTemp);
    }
}
