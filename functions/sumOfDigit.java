public class sumOfDigit {

    public static void sumOfDigit(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sumOfDigit(1234);
    }
}
