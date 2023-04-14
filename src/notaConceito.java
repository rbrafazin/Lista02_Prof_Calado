import java.util.Scanner;

public class notaConceito {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota do aluno de 0 a 100: ");
        int nota = sc.nextInt();
        sc.close();

        if (nota >= 0 && nota <= 49) {
            System.out.println("Insuficiente");
        } else if (nota >= 50 && nota <= 64) {
            System.out.println("Regular");
        } else if (nota >= 65 && nota <= 84) {
            System.out.println("Bom");
        } else {
            System.out.println("Ótimo!");
        }
    }
}
