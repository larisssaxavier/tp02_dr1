import java.util.Scanner;

public class calculadoraDescontos {
    public static String calcularDescontos(double valorCompra){
        double desconto;
        double valorFinal;
        String porcentagem;
        if(valorCompra > 1000){
            porcentagem = "10%";
            desconto = valorCompra * 0.1;
            valorFinal = valorCompra - desconto;
        }
        else if(valorCompra > 500 && valorCompra < 1000){
            porcentagem = "5%";
            desconto = valorCompra * 0.05;
            valorFinal = valorCompra - desconto;
        }
        else{
            porcentagem = "0%";
            desconto = 0;
            valorFinal = valorCompra - desconto;
        }
        return " Desconto aplicado: " + porcentagem + "\n Valor final: " + valorFinal;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: R$");
        double valorCompra = input.nextDouble();

        String descontoTotal = calcularDescontos(valorCompra);

        System.out.println (descontoTotal);
    }
}
