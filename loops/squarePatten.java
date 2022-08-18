import java.util.*;

public class squarePatten {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int input = sc.nextInt();
        for (int i = 1; i <= input; i++) {
            System.out.print(" * ");
            for (int j = 1; j < input; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}