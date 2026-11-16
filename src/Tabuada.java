import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("TABUADA");

        System.out.print("Digite um numero = ");
        int n = sc.nextInt();
        System.out.println("");

        for (int i = 0; i <=10; i++) { // for se utiliza quando sabemos o valor certo para se repetir variavel de controle é a do meio

            int r = n * i;

            System.out.println(n + "*" + i + "=" + r );


        }
    }
}
