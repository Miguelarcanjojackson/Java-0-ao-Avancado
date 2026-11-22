import java.util.Scanner;
public class Velocidade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a velocidade do veiculo = ");
        double v = sc.nextDouble();

        if (v <= 60){

            System.out.println("Velocidade permitida");
        }

        if (v > 60 && v <=80){
            System.out.println("Excesso leve");
        }

        if (v > 80 && v<= 100){
            System.out.println("Execesso moderado");
        }

        if (v > 100){

            System.out.println("Execesso grave");
        }
    }
}
