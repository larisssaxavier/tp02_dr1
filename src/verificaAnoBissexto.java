import java.util.Scanner;

public class verificaAnoBissexto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o ano que deseja verificar se é bissexto: ");
        int ano = input.nextInt();

        boolean anoBissexto = calculadoraIdade.bissexto(ano);

        if(anoBissexto){
            System.out.println(" O ano "+ ano +" é  bissexto!");
        }
        else{
            System.out.println(" O ano "+ ano +" não é bissexto!");
        }
    }
}
