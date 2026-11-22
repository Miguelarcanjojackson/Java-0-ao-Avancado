import java.util.Scanner;
public class Imc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso = ");
        double peso = sc.nextDouble();
        System.out.println("");

        System.out.print("Digite sua altura = ");
        double altura = sc.nextDouble();
        System.out.println("");

        double imc = peso / (altura * altura);

        if (imc <= 18.5){

            System.out.println("Abaixo do peso");
        }

        if (imc > 18.5 && imc <= 24.9){
            System.out.println("Peso normal");

        }

        if (imc >= 25 && imc <= 29.9){
            System.out.println("Sobrepeso");
        }

        if (imc >=30){
            System.out.println("Obesidade");
        }
    }
}
