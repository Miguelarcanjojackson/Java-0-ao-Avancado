import java.util.Scanner;
public class Loja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra = ");
        double compra = sc.nextDouble();

        if (compra <=100){
            double valor_final = compra + 20;
            System.out.println("Compra menos de 100 , frete de 20R$, valor total a pagar é = " + valor_final);
        }

        if (compra > 100 && compra <= 199.99){

            double valor_final = compra + 10;
            System.out.println("Compra de 100 a 199.99 , frete de 20R$, valor total a pagar é = " + valor_final);
        }

        if (compra >= 200){
            System.out.println("Compra acima de 200 , frete gratis, valor total a pagar é = " + compra);
        }
    }
}
