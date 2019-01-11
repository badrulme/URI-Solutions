import java.util.Scanner;

// https://www.urionlinejudge.com.br/judge/en/problems/view/1008

public class Salary1008 {
    public static void main(String[] args) {
        int empNumber, workHour;
        float amount, salary;
        Scanner sc = new Scanner(System.in);
        empNumber = sc.nextInt();
        workHour = sc.nextInt();
        amount = sc.nextFloat();
        salary = workHour * amount;
        System.out.printf("NUMBER = %d\n", empNumber);
        System.out.printf("SALARY = U$ %.2f\n", salary);
        sc.close();
    }
}