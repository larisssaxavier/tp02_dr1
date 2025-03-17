import java.util.Random;
import java.util.Scanner;

public class jogoAdvinhacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int numero = random.nextInt(100)+1;
        int tentativa= 0;
        boolean numeroCerto = false;

        System.out.print("**Tente advinhar o número** \n -Números de 1 a 100- ");

        do{
            System.out.print("\nDigite um número inteiro: ");
            int numero2 = input.nextInt();
            tentativa++;

            if(numero2 ==  numero){
                numeroCerto = true;
            }
            else if (numero2 < numero){
                System.out.println("\nO número que você digitou é menor que o número sorteado. Tente novamente.");
            }
            else{
                System.out.println("\nO número que você digitou é maior que o número sorteado. Tente novamente.");
            }
        }
        while (!numeroCerto);
        System.out.println("\n\nParabéns jogada com sucesso!\nVocê acertou em "+tentativa+" tentativas.");
        input.close();
    }
}
