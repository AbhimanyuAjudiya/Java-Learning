import java.util.Scanner;

public class patterns {

    public static void hollowRect(int totalRow, int totalCol){
        //outter loop for rows
        for (int i = 1; i <= totalRow; i++) {
            //inner loop for columns
            for (int j = 1; j <= totalCol; j++) {
                if (i == 1 || i == totalRow || j == 1 || j == totalCol) { // boundary condition
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void invAndRotHalfPyramid(int totalRow){
        //outter loop for rows
        for (int i = 1; i <= totalRow; i++) {
            //Space
            for (int j = 1; j <= totalRow - i; j++) {
                System.out.print("  ");
            }
            //Star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void invHalfPyramidNum(int totalRow) {
        for (int i = 1; i <= totalRow; i++) {
            for (int j = 1; j <= totalRow-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void floydsTriangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zeroOneTri(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if((i+j)%2 == 0)
                 System.out.print("1 ");
                 else
                 System.out.print("0 ");
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        //1st half
        for (int i = 1; i <= n; i++) {
            //Star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            //Space
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print("  ");
            }
            //Star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //2nd half
        for (int i = n; i >= 1; i--) {
            //Star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            //Space
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print("  ");
            }
            //Star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rombus(int n) {
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void hollowRombus(int n) {
        for (int i = 1; i <= n; i++) {
            //Space
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            //Star
            for (int j = 1; j <= n; j++) {
                if(j == 1 || j == n || i == 1 || i == n)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
        }
    }

    public static void dimond(int n){
        //1st half
        for (int i = 1; i <= n; i++) {
            //space
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            //star
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //2nd half
        for (int i = n; i >= 1; i--) {
            //space
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            //star
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void numPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            //space
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //num
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void palindromicNum(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total rows: ");
        int totalRow = sc.nextInt();
        palindromicNum(totalRow);
        // numPyramid(totalRow);
        // System.out.println("Enter total columns: ");
        // int totalCol = sc.nextInt();
        // hollowRect(totalRow, totalCol);
        // rombus(totalRow);
        // dimond(totalRow);
        // floydsTriangle(totalRow);
        // zeroOneTri(totalRow);
        // butterfly(totalRow);
        // invHalfPyramidNum(totalRow);
        // invAndRotHalfPyramid(totalRow);
    }
}