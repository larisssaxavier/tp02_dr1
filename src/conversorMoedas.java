import java.util.Scanner;
import java.text.DecimalFormat;

public class conversorMoedas {
    public static String conversor(int opcao, double valor){
        DecimalFormat df = new DecimalFormat("0.00");

        double moedaDolar = 5.82; //Cotação no dia da criação do código
        double moedaEuro = 6.30;
        double moedaLibra = 7.52;
        double valorConvertido;
        char tipoMoeda;

        if (opcao == 1){
            valorConvertido = valor / moedaDolar;
            tipoMoeda = '$';
        }
        else if (opcao == 2){
            valorConvertido = valor / moedaEuro;
            tipoMoeda = '€';
        }
        else if (opcao == 3){
            valorConvertido = valor / moedaLibra;
            tipoMoeda = '£';
        }
        else {
            return "Opção inválida!";
        }

        return tipoMoeda + df.format(valorConvertido);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("*** Conversor de moedas ***");
        System.out.print("Digite o valor em reais que deseja converter: \nR$ ");
        double valor = input.nextDouble();
        System.out.println("Insira o numero correspondente da moeda destino: \n 1- Dólar \n 2- Euro \n 3- Libra  ");
        int opcao = input.nextInt();

        System.out.println("\nValor em reais: R$" + valor);
        String resultado = conversor(opcao, valor);
        System.out.println("Valor convertido: " + resultado);
    }
}
