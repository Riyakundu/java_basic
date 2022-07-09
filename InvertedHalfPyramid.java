import java.util.*;

class pattern {
    int n, i, j;
    Scanner sc = new Scanner(System.in);

    void display() {
        System.out.println("Enter the number of rows:");
        n = sc.nextInt();
        for (i = n; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
public class InvertedHalfPyramid {
    public static void main(String[] args) {
        pattern obj = new pattern();
        obj.display();
    }
}
