import java.util.*;

class pattern {
    int n, i, j;
    Scanner sc = new Scanner(System.in);

    public void display() {
        System.out.print("Enter the number of rows: ");
        n = sc.nextInt();
        int p = 1;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(p + " ");
                p++;
            }
            System.out.println();
        }
    }
}

public class FloydsTriangle {
    public static void main(String[] args) {
        pattern obj = new pattern();
        obj.display();
    }
}
