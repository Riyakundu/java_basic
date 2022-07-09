import java.util.*;

class pattern {
    int n;
    Scanner sc = new Scanner(System.in);

    public void display() {
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print("  ");
            }
            for (int l = 1; l <= i; l++) {
                if (l == 1 || l == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print("  ");
            }
            for (int l = 1; l <= i; l++) {
                if (l == 1 || l == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

public class HollowButterfly {
    public static void main(String[] args) {
        pattern obj = new pattern();
        obj.display();
    }
}