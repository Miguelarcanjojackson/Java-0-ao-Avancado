import java.util.Scanner;
public class senha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cadastro de senha!");
        System.out.println("");
        System.out.print("Crie uma senha! = ");
        int login_senha = sc.nextInt();
        sc.nextLine();
        System.out.println("Senha cadastrada!!");
        System.out.print("Crie um usuario = ");

        String login_nome = sc.nextLine();

        System.out.println("");

        System.out.println("Usuario cadastrado!!");

        System.out.println("Banco Brasil");
        System.out.print("Digite sua senha = ");
        int senha = sc.nextInt();
        sc.nextLine();
        System.out.println("");
        System.out.print("Digite seu usuario = ");
        String usuario = sc.nextLine();

        if (senha == login_senha && usuario.equals(login_nome)){
            System.out.println("Acesso autorizado!!");
            System.out.println("Bem vindo");

        } else {
            System.out.println("ACesso negado!!");
        }


    }
}
