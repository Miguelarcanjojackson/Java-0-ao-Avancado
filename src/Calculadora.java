import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("CAlCULADORA");

        System.out.print("Digite sua primeira nota = ");
        int nota_1 = sc.nextInt();

        System.out.println("");

        System.out.print("Digite sua segunda nota = ");
        int nota_2 = sc.nextInt();

        System.out.println("");

        System.out.print("Digite sua terceira nota = ");
        int nota_3 = sc.nextInt();

        int media_final = (nota_1 + nota_2 + nota_3) / 3;

        System.out.println("Sua media final foi = " + media_final);


    }
}
