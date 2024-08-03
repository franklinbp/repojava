import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese un numero");
        double num2 = scanner.nextDouble();

        //SUMA
        double suma = num1 + num2;
        System.out.printf("suma; %.2f%n", suma);

        double resta = num1 - num2;
        System.out.printf("suma; %.2f%n", resta);

        double producto = num1 + num2;
        System.out.printf("suma; %.2f%n", producto);

        double division = 0;
        if (num1 != 0 ){
            division = num1 / num2;
        }
        System.out.printf("suma; %.2f%n", division);
        
    }
}