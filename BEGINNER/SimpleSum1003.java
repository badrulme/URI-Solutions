import java.util.Scanner;

// https://www.urionlinejudge.com.br/judge/en/problems/view/1003

public class SimpleSum1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int soma = a + b;
        System.out.println("SOMA = " + soma);
        sc.close();
    }
}