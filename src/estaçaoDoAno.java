import java.util.Scanner;

public class estaçaoDoAno {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o mês (1 a 12): ");
        int mes = sc.nextInt();
        sc.close();

        if (mes == 1) {
            System.out.print("Mês: Janeiro - Estação: Verão");
        } else if (mes == 2) {
            System.out.print("Mês: Fevereiro - Estação: Verão");
        } else if (mes == 3) {
            System.out.print("Mês: Março - Estação: Verão");
        } else if (mes == 4) {
            System.out.print("Mês: Abril - Estação Outono");
        } else if (mes == 5) {
            System.out.print("Mês: Maior - Estação: Outono");
        } else if (mes == 6) {
            System.out.print("Mês: Junho - Estação: Outono");
        } else if (mes == 7) {
            System.out.print("Mês: Julho - Estação: Inverno");
        } else if (mes == 8) {
            System.out.print("Mês: Agosto - Estação: Inverno");
        } else if (mes == 9) {
            System.out.print("Mês: Setembro - Estação: Inverno");
        } else if (mes == 10) {
            System.out.print("Mês: Outubro - Estação: Primavera");
        } else if (mes == 11) {
            System.out.print("Mês: Novembro - Estação: Primavera");
        } else if (mes == 12) {
            System.out.print("Mês: Dezembro - Estação: Primavera");
        } else {
            System.out.print("Mês invalido!");
        }
    }
}
