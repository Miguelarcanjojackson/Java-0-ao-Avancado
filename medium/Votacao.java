import java.util.Scanner;
public class Votacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade e descubra se esta apto a votar = ");
        int idade_votar = sc.nextInt();

        if (idade_votar < 16){
            System.out.println("Não pode votar");
        }

        if (idade_votar == 16 || idade_votar ==17){
            System.out.println("Voto facultativo");
        }

        if (idade_votar >=18 && idade_votar <=69){
            System.out.println("Voto obrigatorio");
        }

        if (idade_votar >=70){
            System.out.println("Voto facultativo");
        }
    }
}
