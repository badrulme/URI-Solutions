import java.util.Scanner;

// https://www.urionlinejudge.com.br/judge/en/problems/view/1009

public class SalaryWithBonus1009 {
    public static void main(String[] args) {
        String empName;
        double salary, salesAmount, total;
        Scanner sc = new Scanner(System.in);
        empName = sc.nextLine();
        salary = sc.nextDouble();
        salesAmount = sc.nextDouble();
        total = salary + (salesAmount * 15) / 100;
        System.out.printf("TOTAL = R$ %.2f\n", total);
        sc.close();
    }
}