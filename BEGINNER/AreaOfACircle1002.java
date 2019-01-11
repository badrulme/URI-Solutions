import java.io.IOException;
import java.util.Scanner;
// https://www.urionlinejudge.com.br/judge/en/problems/view/1002
public class AreaOfACircle1002 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        double n = 3.14159;
        double r;
        r = sc.nextDouble();
        double area = n * r * r;
        System.out.format("A=%.4f\n", area);
        sc.close();
    }

}