import java.util.Scanner;

public class contagemPalavras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma frase qualquer: ");
        String frase = input.nextLine().trim();

        int contador = 1;
        for(int i = 0; i < frase.length(); i++){
            char f = frase.charAt(i);

            if(f == ' '){
                contador++;
            }
        }
        System.out.println("Quantidade de palavras: " + contador);
    }
}
