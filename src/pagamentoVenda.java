import java.util.Scanner;

public class pagamentoVenda {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da venda: R$");
        double valorvenda = sc.nextDouble();
        System.out.println("1 - A vista \n2 - A prazo 30 dias \n3 - A prazo 60 dias \n4 - A prazo 90 dias \n5 - Cartão de debito \n6 - Cartão de crédito");
        System.out.print("Qual a condição de pagamento (1 a 6): ");
        int condiçaopagamento = sc.nextInt();
        sc.close();

        if (condiçaopagamento == 1) {
            double pagum = valorvenda - (valorvenda * 10 / 100);
            System.out.printf("O total da venda com desconto é R$%.2f", pagum);
        } else if (condiçaopagamento == 2) {
            double pagdois = valorvenda - (valorvenda * 5 / 100);
            System.out.printf("O total da venda com desconto é R$%.2f", pagdois);
        } else if (condiçaopagamento == 3) {
            System.out.printf("O total valor da venda é R$%.2f", valorvenda);
        } else if (condiçaopagamento == 4) {
            double pagquatro = valorvenda + (valorvenda * 5 / 100);
            System.out.printf("O valor total da venda é R$%.2f", pagquatro);
        } else if (condiçaopagamento == 5) {
            double pagcinco = valorvenda - (valorvenda * 8 / 100);
            System.out.printf("O valor total da venda com desconto é R$%.2f", pagcinco);
        } else if (condiçaopagamento == 6) {
            double pagseis = valorvenda - (valorvenda * 7 / 100);
            System.out.printf("O valor total da venda com desconto é R$%.2f", pagseis);
        } else {
            System.out.print("Forma de pagamento inválida.");
        }
    }
}
