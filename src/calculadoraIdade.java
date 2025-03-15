import java.time.LocalDate;
import java.util.Scanner;

public class calculadoraIdade {
    public static boolean bissexto (int ano){
        return  (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0);
    }
    public static int diasMes(int mes, int ano){
        switch (mes){
            case 4: case 6: case 9: case 11: return 30;
            case 2: return bissexto(ano) ?  29 : 28;
            default : return 31;
        }
    }
    public static int totalDias(int dia, int mes, int ano) {
        int total = 0;

        for (int x = 1; x < mes; x++){
            total += diasMes(mes, ano);
        }
        for (int y = 1; y < ano; y++){
            total += bissexto(y) ? 366 : 365;
        }
        total += dia;

        return total;
    }
    public static int calculaTotalDias(int diaNasc, int mesNasc, int anoNasc){
        LocalDate dia = LocalDate.now();
        int diaAtual = dia.getDayOfMonth();
        int mesAtual = dia.getMonthValue();
        int anoAtual = dia.getYear();

        int diasNascido = totalDias(diaNasc, mesNasc, anoNasc);
        int diasAtual = totalDias(diaAtual, mesAtual, anoAtual);

        return diasAtual - diasNascido;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a data do seu nascimento: ");
        int dataNascimento = input.nextInt();
        System.out.print("Digite o número correspondente ao mês do seu nascimento: ");
        int mesNascimento = input.nextInt();
        System.out.print("Digite o ano de seu nascimento: ");
        int anoNascimento = input.nextInt();

        if(mesNascimento < 1 || mesNascimento > 12){
            System.out.println("\nMês inválido!");
            return;
        }
        if(dataNascimento < 1 || dataNascimento > 31){
            System.out.println("\nData inválida!");
            return;
        }

        int idadeDias = calculaTotalDias(dataNascimento, mesNascimento, anoNascimento);
        if(idadeDias == 0 || idadeDias < 0){
            System.out.println("\nVocê ainda não nasceu?!");
        }
        else{
            System.out.println("\nVocê está vivo há "+ idadeDias+" dias!");
        }
    }
}
