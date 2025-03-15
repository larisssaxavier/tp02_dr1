import java.util.Scanner;
import java.text.DecimalFormat;

public class calculadoraImpostoRenda {
    private static int faixaSalario(double salario) {
        if (salario <= 2259.20) return 0;
        else if (salario <= 2826.65) return 1;
        else if (salario <= 3751.05) return 2;
        else if (salario <= 4664.68) return 3;
        else return 4;
    }
    private static double previdencia(int idade){
        if(idade > 64){
            return 1903.98;
        }
        else return 0;
    }
    public static String valorSemImposto(double salario, int qtdDepenentes, int idade){
        DecimalFormat df = new DecimalFormat("0.00");

        double salarioLiquido;
        double aliquota;
        double descPrevidencia = previdencia(idade);
        double descDependentes = qtdDepenentes * 189.59;
        int faixa = faixaSalario(salario);
        double deducao = descPrevidencia + descDependentes;

        switch (faixa){
            case 0: {
                salarioLiquido = salario;
                df.format(salarioLiquido);
                double ir = 0.0;
                return formatoRetorno(salario, faixa, descDependentes, descPrevidencia, ir, salarioLiquido);
            }
            case 1: {
                aliquota = salario * 0.075;
                double ir = Math.max(aliquota-deducao, 0.0);
                salarioLiquido = salario - ir;
                return formatoRetorno(salario, faixa, descDependentes, descPrevidencia, ir, salarioLiquido);
            }
            case 2: {
                aliquota = salario * 0.15;
                double ir = Math.max(aliquota-deducao, 0.0);
                salarioLiquido = salario - ir;
                return formatoRetorno(salario, faixa, descDependentes, descPrevidencia, ir, salarioLiquido);
            }
            case 3: {
                aliquota = salario * 0.225;
                double ir = Math.max(aliquota-deducao, 0.0);
                salarioLiquido = salario - ir;
                return formatoRetorno(salario, faixa, descDependentes, descPrevidencia, ir, salarioLiquido);
            }
            case 4: {
                aliquota = salario * 0.275;
                double ir = Math.max(aliquota-deducao, 0.0);
                salarioLiquido = salario - ir;
                return formatoRetorno(salario, faixa, descDependentes, descPrevidencia, ir, salarioLiquido);
            }
        }
        return " ";
    }
    private static String formatoRetorno(double salario, int faixa, double descDependentes, double descPrevidencia, double ir, double salarioLiquido){
        DecimalFormat df = new DecimalFormat("0.00");

        String salarioFormatado = df.format(salario);
        String DescDependentesFormatado = df.format(descDependentes);
        String DescPrevidenciaFormatado = df.format(descPrevidencia);
        String irFormatado = df.format(ir);
        String SalarioLiquidoFormatado = df.format(salarioLiquido);

        return "\nSalário bruto: R$" + salarioFormatado +
                "\nFaixa salarial: " + faixa +
                "\nDesconto dependentes: R$" + DescDependentesFormatado +
                "\nDesconto previdencia: R$" + DescPrevidenciaFormatado +
                "\nO valor do desconto do imposto de renda foi: R$" + irFormatado +
                "\nValor Liquido: R$" + SalarioLiquidoFormatado;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor do seu salário bruto: ");
        double salarioBruto = input.nextDouble();
        System.out.print("Quantos dependentes possui: ");
        int qtdDependentes = input.nextInt();
        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();

        String valorSalario = valorSemImposto(salarioBruto, qtdDependentes, idade);
        System.out.println(valorSalario);
    }
}
