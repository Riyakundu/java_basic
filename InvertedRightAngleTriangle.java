import java.util.*;

class pattern {
    int n, i, j, k;
    Scanner sc = new Scanner(System.in);

    void display() {
        System.out.println("Enter the number of rows:");
        n = sc.nextInt();
        for (i = n; i >=1; i--) {
            for (k = 1; k <= n - i; k++) {
                System.out.print("  ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class InvertedRightAngleTriangle {
    public static void main(String[] args) {
        pattern obj = new pattern();
        obj.display();
    }
}