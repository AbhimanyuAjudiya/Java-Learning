import java.util.Scanner;

public class binAndDec {
    public static void binToDec(int binNum) {
        int myNum = binNum;
        int decNum = 0;
        int pow = 0;
        while (binNum != 0) {
            int lastDigit = binNum % 10;
            decNum += lastDigit * (int)Math.pow(2, pow);
            pow++;
            binNum /= 10;
        }
        System.out.println("Decimal of "+ myNum +" = " + decNum);
    }
    public static void decToBin(int decNum) {
        int bin = 0;
        int pow = 0;
        while (decNum > 0) {
            int rem = decNum % 2;
            bin = bin + (rem * (int)Math.pow(10, pow));
            pow++;
            decNum /= 2;
        } 
        System.out.println("Binary of "+ decNum +" = " + bin);   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        int binNum = sc.nextInt();
        binToDec(binNum);
        System.out.println("Enter a decimal number: ");
        int decNum = sc.nextInt();
        decToBin(decNum);
    }
}
