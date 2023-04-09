import java.util.Scanner;

/*Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit. */

public class App {
    public static void main(String[] args) throws Exception {
        double c, f;
        Scanner dig;
        dig = new Scanner(System.in);

        System.out.println("Informe a temperatura em celsius");
        c = dig.nextInt();

        f = c * 1.8 + 32;

        System.out.println("o valor convertido em fahrenheit é " + f + "f");

    }
}
