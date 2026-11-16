import java.util.Scanner;
public class positivos_negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int acumulador_positivo = 0;
        int acumulador_negativo = 0;
        int acumulador_0 = 0;


        for (int i = 0; i < 10 ; i++) {

            System.out.print("Digite numero " + (i+1) + " = ");
            int n = sc.nextInt();

            if (n > 0){
                acumulador_positivo = acumulador_positivo + 1;
            }

            if (n < 0){
                acumulador_negativo = acumulador_negativo + 1;
            }

            if (n == 0){
                acumulador_0 = acumulador_0 + 1;
            }

        }

        System.out.println("A quantidade de numeros positivos são = " + acumulador_positivo);
        System.out.println("A quantidade de numeros negativos são = " + acumulador_negativo);
        System.out.println("A quantidade de numeros igual a 0  =  " + acumulador_0);

        sc.close();

    }
}
