import java.util.Scanner;

// https://www.urionlinejudge.com.br/judge/en/problems/view/1042

public class SimpleSort1042 {
    public static void main(String[] args) {
        int A, B, C, Min1, Min2, Min3;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        Min1 = Math.min(A, Math.min(B, C));
        if (Min1 == A) {
            Min2 = Math.min(B, C);
            Min3 = Math.max(B, C);
        } else if (Min1 == B) {
            Min2 = Math.min(A, C);
            Min3 = Math.max(A, C);
        } else {
            Min2 = Math.min(A, B);
            Min3 = Math.max(A, B);
        }
        System.out.println(Min1 + "\n" + Min2 + "\n" + Min3);
        System.out.println(A + "\n" + B + "\n" + C);
        sc.close();
    }
}