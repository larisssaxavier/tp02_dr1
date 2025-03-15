import java.util.Scanner;

public class calculadoraDescontos {
    public static double calcularDescontos(double valorCompra){
        double desconto;
        double valorFinal;
        if(valorCompra > 1000){
            desconto = valorCompra * 0.1;
            valorFinal = valorCompra - desconto;
        }
        else if(valorCompra > 500 && valorCompra < 1000){
            desconto = valorCompra * 0.05;
            valorFinal = valorCompra - desconto;
        }
        else{
            desconto = 0;
            valorFinal = valorCompra - desconto;
        }
        return valorFinal;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: R$");
        double valorCompra = input.nextDouble();

        double descontoTotal = calcularDescontos(valorCompra);

        System.out.println("Valor final com desconto: R$" + descontoTotal);
    }
}
