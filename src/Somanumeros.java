import java.util.Scanner;
public class Somanumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int acumulador = 0;



        while (true){

            System.out.print("Digite um numero = ");
            int n = sc.nextInt();

            if (n == 0){
                break;
            }

            acumulador = acumulador + n;

        }

        System.out.println("O Resultado da soma é = " + acumulador);
    }
}
