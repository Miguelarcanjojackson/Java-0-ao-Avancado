import java.util.Scanner;
public class ano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o ano = ");
        int ano = sc.nextInt();
                        //v                         //v
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){

                System.out.println("Esse ano é bisexto " + ano);

        }
    }


}
