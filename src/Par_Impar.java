import java.util.Scanner;
public class Par_Impar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero e descubra se é impar ou par = ");
        int numero = sc.nextInt();

        System.out.println("");

        if (numero % 2 == 0){

            System.out.println("Esse numero é par");
        }
        else {
            System.out.println("Esse numero é impar");
        }

    }
}
