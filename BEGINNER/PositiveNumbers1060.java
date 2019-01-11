import java.util.Scanner;

// https://www.urionlinejudge.com.br/judge/en/problems/view/1060
public class PositiveNumbers1060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        double A;
        for (int i = 0; i < 6; ++i) {
            A = sc.nextDouble();
            if (A > 0) {
                count++;
            }
        }
        System.out.printf("%d valores positivos\n", count);
        sc.close();
    }
}