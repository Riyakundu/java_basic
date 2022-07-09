import java.util.*;

class pattern {
    int n;
    Scanner sc = new Scanner(System.in);

    public void display() {
        System.out.print("Enter the number of rows: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}

public class PalindromPyramid {
    public static void main(String[] args) {
        pattern obj = new pattern();
        obj.display();
    }
}