import java.util.Scanner;
public class notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite sua nota = ");
        double nota = sc.nextDouble();
        
        if (nota >= 0 && nota <= 4.9){
            System.out.println("insuficiente");
            
        }

        if (nota >= 5 && nota <= 6.9) {
            System.out.println("recuperação");
        }

        if (nota >= 7 && nota <= 8.9){
            System.out.println("Bom");
        }

        if (nota >= 9 && nota <=10){
            System.out.println("Exelente");
        }

    }
}
