import java.util.Scanner;

public class InfPessoal {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite o seu sobrenome: ");
        String sobrenome = sc.nextLine();
        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite a cidade em que nasceu: ");
        String cidade = sc.nextLine();

        System.out.print("Deseja visualizar dados completos? ");
        String dados = sc.nextLine();
        sc.close();

        if (dados.equals("S")) {
            System.out.printf("Nome: %s \nSobrenome: %s \nIdade: %d \nNaturalidade: %s", nome, sobrenome, idade,
                    cidade);

        } else if (dados.equals("N")) {
            System.out.printf("Nome: %s \nIdade: %d", nome, idade);
        } else {
            System.out.println("Digitação errada. Tente novamente.");
        }
    }
}
