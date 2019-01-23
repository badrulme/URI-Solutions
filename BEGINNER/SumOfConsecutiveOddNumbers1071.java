import java.util.Scanner;

// https://www.urionlinejudge.com.br/judge/en/problems/view/1071

public class SumOfConsecutiveOddNumbers1071 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x, y, sum = 0;
        x = sc.nextInt();
        y = sc.nextInt();
        if (x < y) {
            for (int i = x + 1; i < y; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
        } else if (y < x) {
            for (int i = y + 1; i < x; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
        } else {
            sum = 0;
        }
        System.out.println(sum);
        sc.close();
    }
}