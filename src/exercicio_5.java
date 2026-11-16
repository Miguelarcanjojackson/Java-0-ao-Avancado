import java.util.Scanner;
public class exercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor  da compra = ");
        double valor_compra = sc.nextDouble();

        if (valor_compra < 200){
            System.out.println("Valor total á pagar é = " + valor_compra);
        }

        if (valor_compra > 500){
            double valor_com_desconto = valor_compra - (valor_compra * 0.15);

            System.out.println("Sua compra final com desconto de 15% é = " + valor_com_desconto);
        }

        if (valor_compra >=200 && valor_compra <= 500){

            double valor_com_desconto = valor_compra - (valor_compra * 0.10);

            System.out.println("Sua compar final com desconto de 10% é = " + valor_com_desconto);
        }


        sc.close();
    }
}
