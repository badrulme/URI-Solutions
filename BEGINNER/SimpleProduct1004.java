import java.util.Scanner;

// https://www.urionlinejudge.com.br/judge/en/problems/view/1004

public class SimpleProduct1004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int prod = a * b;
        System.out.println("PROD = " + prod);
        sc.close();
    }
}