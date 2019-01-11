import java.io.IOException;
import java.util.Scanner;
// https://www.urionlinejudge.com.br/judge/en/problems/view/1001

public class ExtremelyBasic1001 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int c = a + b;
        System.out.println("X = " + c);
        sc.close();
    }

}