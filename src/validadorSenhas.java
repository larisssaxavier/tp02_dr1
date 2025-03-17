import java.util.Scanner;

public class validadorSenhas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\nDigite a senha que deseja associar a sua conta \n\n - Pelo menos 5 dígitos \n - Pelo menos um caractere especial \n - Pelo menos um número \n - Pelo menos uma letra maiúscula \n\nDigite: ");

        boolean senhaValida = false;

        do{
            String senha = input.nextLine();

            boolean validaSenha = true;
            boolean temCaractere = false;
            boolean temNumero = false;
            boolean temMaiuscula = false;

            if(senha.length() < 5){
                System.out.println("\nA senha deve ter pelo menos 5 caracteres!");
                validaSenha = false;
            }
            for (int i = 0; i < senha.length(); i++){
                char s = senha.charAt(i);

                if(s>='A' && s<='Z'){
                    temMaiuscula = true;
                }
                else if(s >= '0' && s <= '9'){
                    temNumero = true;
                }
                else if(!(s >= 'a' && s <= 'z')){
                    temCaractere = true;
                }
            }

            String erros = " ";
            if(!temMaiuscula){
                erros += "\nAtenção!!! Deve conter pelo menos uma letra maiúscula!";
            }
            if(!temNumero){
                erros += "\nAtenção!!! Deve conter pelo menos um número!";
            }
            if(!temCaractere){
                erros += "\nAtenção!!! Deve conter pelo menos um caractere especial!";
            }

            if (validaSenha &&  temCaractere && temNumero && temMaiuscula){
                senhaValida = true;
                System.out.println("\nSenha válida! Cadastro concluído com sucesso!");
            }
            else{
                System.out.println("\nSenha inválida! Atente-se aos seguintes critérios: " + erros);
                System.out.print("Digite novamente: ");
            }
        }
        while (!senhaValida);
        input.close();
    }
}
