import java.util.Scanner;

public class sequenciaNumerica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para iniciar uma sequência: ");
        int numSequencia = input.nextInt();
        System.out.print("Digite um número para incremento na sequência: ");
        int numIncremento = input.nextInt();

        int limite = 100;
        while (numSequencia <= limite){
            System.out.println(numSequencia);
            numSequencia += numIncremento;
        }
    }
}
