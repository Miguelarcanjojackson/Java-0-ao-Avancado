import java.util.Scanner;
public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero = ");
        int n1 = sc.nextInt();

        System.out.println("");

        for (int i = 0; i < n1 ; i++) {

            int n2 = n1 - i;

            System.out.println(n2);

        }

    }
}
