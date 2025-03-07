import java.util.Scanner;

public class mediaNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = input.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = input.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = input.nextDouble();
        System.out.print("Digite a quarta nota: ");
        double nota4 = input.nextDouble();
        System.out.println(" ");

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        if  (media >= 7) {
            System.out.println("Parabéns! A sua média de notas foi: " + media);
            System.out.println("Status: Aprovado. ");
        } else if (media >= 5) {
            System.out.println("A sua média de notas foi: " + media);
            System.out.println("Status: Recuperação. ");
        }
        else{
            System.out.println("A sua média de notas foi: " + media);
            System.out.println("Status: Reprovado. ");
        }
    }
}
