import java.util.Scanner;

public class NumeroInteiro {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();
        sc.close();

        if (n % 2 == 0 && n > 0) {
            System.out.printf("O número %d é Par e Positivo", n);
        } else if (n % 2 == 0 && n < 0) {
            System.out.printf("O número %d é Par e Negativo", n);
        } else if (n % 2 != 0 && n > 0) {
            System.out.printf("O número %d é Ímpar e Positivo", n);
        } else {
            System.out.printf("O número %d é Ímpar e Negativo", n);
        }
    }
}
