import java.util.*;

class pattern {
    int r, c, i, j;
    Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("Enter the number of rows:");
        r = sc.nextInt();
        System.out.println("Enter the number of columns:");
        c = sc.nextInt();
    }

    public void display() {
        for (i = 1; i <= r; i++) {
            for (j = 1; j <= c; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class SolidRectangle {
    public static void main(String[] args) {
        pattern obj = new pattern();
        obj.input();
        obj.display();
    }
}
