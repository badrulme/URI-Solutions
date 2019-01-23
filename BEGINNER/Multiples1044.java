import java.util.Scanner;

// https://www.urionlinejudge.com.br/judge/en/problems/view/1044

public class Multiples1044 {
    public static void main(String[] args) {
        int A, B;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
        sc.close();
    }
}
