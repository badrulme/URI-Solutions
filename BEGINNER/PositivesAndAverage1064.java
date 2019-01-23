import java.util.Scanner;

// https://www.urionlinejudge.com.br/judge/en/problems/view/1064

public class PositivesAndAverage1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countPositiveNumber = 0;
        float x, sumOfPositiveNumber = 0, avgValue;
        for (int i = 0; i < 6; i++) {
            x = sc.nextFloat();
            if (x > 0) {
                countPositiveNumber++;
                sumOfPositiveNumber += x;
            }
        }
        avgValue = sumOfPositiveNumber / countPositiveNumber;
        System.out.printf("%d valores positivos\n", countPositiveNumber);
        System.out.println(avgValue);
        sc.close();
    }
}