import java.util.Scanner;
public class emprestimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo Emprestimo!!!");
        System.out.print("Digite sua idade = ");
        int idade = sc.nextInt();

        System.out.println("");


        System.out.print("Digite sua renda mensal = ");
        double renda_mensal = sc.nextDouble();

        System.out.println("");

        sc.nextLine();


        System.out.print("Possui restrições financeiras? = ");
        String r = sc.nextLine();

        System.out.println("");

        if (idade < 18 ){

            System.out.println("Não é possivel pela sua idade");
        }

        if (idade >=18){

            if (renda_mensal < 2000){

                System.out.println("Não é possivel pela sua renda");

            } else if (renda_mensal >= 2000 && r.equalsIgnoreCase("n")) {
                System.out.println("Emprestimo aprovado!!!");



            } else {
                System.out.println("Não foi possviel");

            }
        }
    }
}
