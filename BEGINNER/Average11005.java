import java.util.Scanner;

// https://www.urionlinejudge.com.br/judge/en/problems/view/1005

public class Average11005 {
    public static void main(String[] args) {
        float A, B, C;
        Scanner sc = new Scanner(System.in);
        A = sc.nextFloat();
        B = sc.nextFloat();
        C = (float) (((A * 3.5) + (B * 7.5)) / (3.5 + 7.5));
        String media = String.format("MEDIA = %,.5f", C);
        System.out.print(media + "\n");
        sc.close();
    }
}