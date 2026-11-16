import java.util.Scanner;
public class Maior_entre_numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite numero 1 = ");
        int n1 = sc.nextInt();
        System.out.println("");

        System.out.print("Digite numero 2 = ");
        int n2 = sc.nextInt();
        System.out.println("");

        System.out.print("Digite o numero 3 = ");
        int n3 = sc.nextInt();
        System.out.println("");

        if (n1 > n2 && n1 > n3 ){
            System.out.println("Numero maior = " + n1);
        }

        if (n2 > n1 && n2 > n3){
            System.out.println("Numero maior = " + n2);
        }

        if (n3 > n1 && n3 > n2){
            System.out.println("Numero maior = " + n3);
        }

    }
}
