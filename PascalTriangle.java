import java.util.*;

class pattern {
    int n;
    Scanner sc = new Scanner(System.in);

    public void display() {
        System.out.print("Enter the number of rows: ");
        n = sc.nextInt();
        int p = 1;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    p = 1;
                } else {
                    p = (p * (i - j + 1)) / (j - 1);
                }
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}

public class PascalTriangle {
    public static void main(String[] args) {
        pattern obj = new pattern();
        obj.display();
    }
}
