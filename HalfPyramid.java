import java.util.*;

class pattern {
    int n, i, j;
    Scanner sc = new Scanner(System.in);

    void display() {
        System.out.println("Enter the number of rows:");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class HalfPyramid {
    public static void main(String[] args) {
        pattern obj = new pattern();
        obj.display();
    }
}
