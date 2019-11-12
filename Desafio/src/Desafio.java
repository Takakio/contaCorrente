import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        //Desafio DB1
        Scanner scan = new Scanner(System.in);

        System.out.println("Numero 1: ");
        float numero1 = scan.nextInt();
        scan.nextLine();

        float numerosImpares = numero1 / 2;


        System.out.println(Math.round(numerosImpares));

    }
}
