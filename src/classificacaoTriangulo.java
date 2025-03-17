import java.util.Scanner;

public class classificacaoTriangulo {
    public static String identificaTriangulo(double ladoA, double ladoB, double ladoC){
        if(ladoA == ladoB && ladoA == ladoC){
            System.out.print("\n-> Medidas dos lados do triângulo são iguais portanto trata-se de um triângulo equilátero!");
        }
        else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC ){
            System.out.print("\n-> Triângulo possui dois lados iguais e um diferente. É um triângulo isósceles!");
        }
        else {
            System.out.print("\n-> Medidas do triângulo são todas diferente o que caracteriza um triângulo escaleno!");
        }
        return " ";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o comprimento do lado A do triângulo:  ");
        double ladoA = input.nextDouble();
        System.out.print("Digite o comprimento do lado B o triângulo: ");
        double ladoB = input.nextDouble();
        System.out.print("Digite o comprimento do lado C o triângulo: ");
        double ladoC = input.nextDouble();

        String compara =  identificaTriangulo(ladoA, ladoB, ladoC);
        System.out.println(compara);
    }
}
