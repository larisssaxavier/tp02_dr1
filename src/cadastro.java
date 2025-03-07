import java.util.Scanner;

public class cadastro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = input.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = Integer.parseInt(input.nextLine());

        System.out.println("Informe o nome da sua mãe : ");
        String nomeMae = input.nextLine();

        System.out.println("Informe o nome do seu pai: ");
        String nomePai = input.nextLine();

        int tamanhoNome =  nomeCompleto.length();
        int tamanhoNomeMae =  nomeMae.length();
        int tamanhoNomePai =  nomePai.length();

        boolean comparaNomeMae =  tamanhoNome > tamanhoNomeMae;
        boolean comparaNomePai = tamanhoNome > tamanhoNomePai;

        System.out.println(" ");
        System.out.println("------- INFORMAÇÕES DO USUÁRIO -------");
        System.out.println("Nome completo: " + nomeCompleto);
        System.out.println("Idade: " + idade);
        System.out.println("Nome da mãe: " + nomeMae);
        System.out.println("Nome do pai: " + nomePai);
        System.out.println(" ");
        System.out.println("------- COMPARAÇÃO -------");
        System.out.println("Tamanho do nome do usuário: " +tamanhoNome);
        System.out.println("Tamanho do nome da mãe: " +tamanhoNomeMae);
        System.out.println("Tamanho do nome do pai: " +tamanhoNomePai);
        System.out.println(" ");
        System.out.println("Nome do usuário maior que o nome da mãe?  " + (comparaNomeMae ? "Sim" : "Nao"));
        System.out.println("Nome do usuário maior que o nome do pai?  " + (comparaNomePai ? "Sim" : "Nao"));
    }
}
