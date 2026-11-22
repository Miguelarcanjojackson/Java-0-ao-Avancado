import java.util.Scanner;
public class Intervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero = ");
        int numero = sc.nextInt();

        if (numero > 10 && numero < 50){

            System.out.println("O numero esta entre 10 e 50");
        } else {

            System.out.println("O numero digitado não esta entre 10 e 50");
        }
    }
}
