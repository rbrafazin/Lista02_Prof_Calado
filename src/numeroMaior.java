import java.util.Scanner;

public class numeroMaior {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        double b = sc.nextDouble();
        sc.close();

        double maior = a;
        if (b > a) {
            maior = b;
        }
        System.out.printf("O maior número é %f", maior);
    }
}
