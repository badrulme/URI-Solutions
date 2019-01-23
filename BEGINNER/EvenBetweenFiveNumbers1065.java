
import java.util.Scanner;

// https://www.urionlinejudge.com.br/judge/en/problems/view/1065

public class EvenBetweenFiveNumbers1065 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int countEvenNumber = 0, countOddNumber = 0, countPositiveNumber = 0, countNegativeNumber = 0;
        float x;
        for (int i = 0; i < 5; i++) {
            x = sc.nextFloat();
            if (x % 2 == 0) {
                countEvenNumber++;
            } else {
                countOddNumber++;
            }
            if (x >= 0) {
                if (x != 0) {
                    countPositiveNumber++;
                }
            } else {
                countNegativeNumber++;
            }
        }
        System.out.printf("%d valor(es) par(es)\n", countEvenNumber);
        System.out.printf("%d valor(es) impar(es)\n", countOddNumber);
        System.out.printf("%d valor(es) positivo(s)\n", countPositiveNumber);
        System.out.printf("%d valor(es) negativo(s)\n", countNegativeNumber);
        sc.close();
    }
}
