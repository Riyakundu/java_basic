import java.util.*;

class pattern {
    int n, i, j;
    Scanner sc = new Scanner(System.in);

    public void display() {
        System.out.print("Enter the number of rows: ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

public class PatternWith01 {
    public static void main(String[] args) {
        pattern obj = new pattern();
        obj.display();
    }
}