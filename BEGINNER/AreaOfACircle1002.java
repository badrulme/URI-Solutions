import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class AreaOfACircle1002 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        double n = 3.14159;
        double r;
        r = sc.nextDouble();
        double area = n * r * r;
        System.out.format("A=%.4f\n", area);

    }

}