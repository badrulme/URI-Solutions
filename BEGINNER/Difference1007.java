import java.util.Scanner;

// https://www.urionlinejudge.com.br/judge/en/problems/view/1007

public class Difference1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        int diff = (a * b - c * d);
        System.out.println("DIFERENCA = " + diff);
        sc.close();
    }
}