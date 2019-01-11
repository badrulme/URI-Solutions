import java.util.Scanner;
// https://www.urionlinejudge.com.br/judge/en/problems/view/1038
public class Snack1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X, Y;
        float Total = 0;
        X = sc.nextInt();
        Y = sc.nextInt();
        if (X == 1) {
            Total = 4 * Y;
        } else if (X == 2) {
            Total = (float) 4.5 * Y;
        }
        if (X == 3) {
            Total = 5 * Y;
        }
        if (X == 4) {
            Total = 2 * Y;
        }
        if (X == 5) {
            Total = (float) 1.5 * Y;
        }
        System.out.printf("Total: R$ %.2f", Total);
        sc.close();
    }
}