import java.util.Scanner;

// https://www.urionlinejudge.com.br/judge/en/problems/view/1010

public class SimpleCalculate1010 {
    public static void main(String[] args) {
        int productNo, units;
        float price, value;
        Scanner sc = new Scanner(System.in);

        // For first product
        productNo = sc.nextInt();
        units = sc.nextInt();
        price = sc.nextFloat();
        value = units * price;
        
        // For second product
        productNo = sc.nextInt();
        units = sc.nextInt();
        price = sc.nextFloat();
        value += units * price;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", value);
        sc.close();
    }
}