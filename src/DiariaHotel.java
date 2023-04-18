import java.util.Scanner;

public class DiariaHotel {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de diárias: ");
        int diaria = sc.nextInt();
        sc.close();

        if (diaria > 15) {
            double diariamaior = 60 + (diaria * 5.5);
            System.out.printf("O valor total da hospedagem é R$%.2f", diariamaior);
        } else if (diaria == 15) {
            double diariaigual = 60 + (diaria * 6);
            System.out.printf("O valor total da hospedagem é R$%.2f", diariaigual);
        } else {
            double diariamenor = 60 + (diaria * 8);
            System.out.printf("O valor total da hospedagem é R$%.2f", diariamenor);
        }
    }
}
