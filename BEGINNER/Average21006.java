import java.util.Scanner;

// https://www.urionlinejudge.com.br/judge/en/problems/view/1006

public class Average21006 {
    public static void main(String[] args) {
        float A, B, C, D;
        Scanner sc = new Scanner(System.in);
        A = sc.nextFloat();
        B = sc.nextFloat();
        C = sc.nextFloat();
        D = (float) (((A * 2) + (B * 3) + (C * 5)) / (2 + 3 + 5));
        String media = String.format("MEDIA = %,.1f", D);
        System.out.print(media + "\n");
        sc.close();
    }
}