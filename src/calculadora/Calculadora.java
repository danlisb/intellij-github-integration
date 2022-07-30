package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        int dividir = dividir(a, b);

        System.out.println("A soma é: " + somar);
        System.out.println("A subtração é: " + subtrair);
        System.out.println("A multiplicação é: " + multiplicar);
        System.out.println("A divisão é: " + dividir);
    }
    //command + d para duplicar o selecionado
    public static int somar(int a, int b){
        return a + b;
    }
    public static int subtrair(int a, int b){
        return a - b;
    }
    public static int multiplicar(int a, int b){
        return a * b;
    }
    public static int dividir(int a, int b){
        return a / b;
    }
}
