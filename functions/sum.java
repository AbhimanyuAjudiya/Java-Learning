import java.util.Scanner;

public class sum {

    public static int sunOfab(int a, int b) {
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter values: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(sunOfab(x, y));
    }
}
