import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double salariominimo = 1.300;

        Scanner scanner = new Scanner(System.in);
        System.out.println("qual o seu salario?");
        double salariodocara = scanner.nextDouble();

        double salarios = salariodocara/salariominimo;

        System.out.println("você ganha aproximadamente " + salarios + " salarios minimos");
    }
}