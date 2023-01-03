import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("++++++++++++ Calculadora ++++++++++++++++++++");

        System.out.println("\n[1] Soma" +
                "\n[2] Subtração" +
                "\n[3] Multiplicação" +
                "\n[4] Divisão\n"
        );
        System.out.print("Qual operação deseja fazer: [1][2][3][4] ");
        int operation = scanner.nextInt();

        if(operation <= 0 || operation > 4){
            System.out.println("Operação inválido! Digite o número de uma operação válida: [1][2][3][4]");
        } else {
            System.out.print("Digite o primeiro valor: ");
            double num1 = scanner.nextDouble();
            System.out.print("Digite o segundo valor: ");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            double sub = num1 - num2;
            double multi = num1 * num2;
            double div  = num1 / num2;

            System.out.println("");

            if (operation == 1) {
                System.out.println(num1 + " + " + num2 + " = " + " " + sum);
            } else if (operation == 2) {
                System.out.println(num1 + " - " + num2 + " = " + " " + sub);
            } else if (operation == 3) {
                System.out.println(num1 + " * " + num2 + " = " + " " + multi);
            } else if (operation == 4 && num2 != 0) {
                System.out.println(num1 + " / " + num2 + " = " + " " + div);
            } else if (operation == 4 && num2 == 0){
                System.out.println("Erro, tente novamente! Divisão por zero");
            }
        }

    }
}