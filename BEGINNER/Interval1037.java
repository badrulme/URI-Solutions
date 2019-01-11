import java.util.Scanner;

// https://www.urionlinejudge.com.br/judge/en/problems/view/1037 
public class Interval1037 {
    public static void main(String[] args) {
        float A;
        Scanner sc = new Scanner(System.in);
        A = sc.nextFloat();

        if (A < 0 || A > 100) {
            System.out.println("Fora de intervalo");
        } else {
            if (A <= 25) {
                System.out.println("Intervalo [0,25]");
            } else if (A > 25 && A <= 50) {
                System.out.println("Intervalo (25,50]");
            } else {
                System.out.println("Intervalo (75,100]");
            }
        }
        sc.close();
    }
}