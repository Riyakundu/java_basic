import java.util.*;

class pattern {
    int n, i, j, k;
    Scanner sc = new Scanner(System.in);

    public void display() {
        System.out.print("Enter the numer of lines: ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (k = 1; k <= n - i; k++) {
                System.out.print("  ");
            }
            for (j = 1; j <= n; j++) {
                if (j == 1 || j == n || i == 1 || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

public class HollowRhombus {
    public static void main(String[] args) {
        pattern obj = new pattern();
        obj.display();
    }
}