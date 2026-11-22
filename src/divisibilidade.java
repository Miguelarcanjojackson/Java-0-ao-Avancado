import java.util.Scanner;
public class divisibilidade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite numero 1 = ");
        int numero_1 = sc.nextInt();
        System.out.println("");

        System.out.print("Digite numero 2 = ");
        int numero_2 = sc.nextInt();


        if (numero_1 % numero_2 == 0){
            System.out.print("Ambos são divisiveis");
        } else {
            System.out.println("Ambos não sao divisivei");
        }
    }
}
