import java.util.Scanner;

// https://www.urionlinejudge.com.br/judge/en/problems/view/1070
public class SixOddNumbers1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, countOddNumber = 1;
        x = sc.nextInt();
        for (int i = x; countOddNumber < 7; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                countOddNumber++;
            }
        }
        sc.close();
    }
}