import java.util.Scanner;

public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil+pen+eraser;

        float bill = total + (0.18f * total);
        System.out.println(bill);

    }
}
