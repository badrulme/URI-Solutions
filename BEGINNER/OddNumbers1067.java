import java.util.Scanner;

// https://www.urionlinejudge.com.br/judge/en/problems/view/1067

public class OddNumbers1067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        for (int i = 1; i <= X; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}