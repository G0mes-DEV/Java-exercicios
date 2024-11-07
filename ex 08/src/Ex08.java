/*
var
    moedas1, moedas5, moedas10, moedas25, moedas50, moedas1Real: inteiro
    total: real

inicio
    // Entrada de dados
    escreva("Digite a quantidade de moedas de 1 centavo: ")
    leia(moedas1)

    escreva("Digite a quantidade de moedas de 5 centavos: ")
    leia(moedas5)

    escreva("Digite a quantidade de moedas de 10 centavos: ")
    leia(moedas10)

    escreva("Digite a quantidade de moedas de 25 centavos: ")
    leia(moedas25)

    escreva("Digite a quantidade de moedas de 50 centavos: ")
    leia(moedas50)

    escreva("Digite a quantidade de moedas de 1 real: ")
    leia(moedas1Real)

    // Cálculo do total
    total <- (moedas1 * 0.01) + (moedas5 * 0.05) + (moedas10 * 0.10) + (moedas25 * 0.25) + (moedas50 * 0.50) + (moedas1Real * 1.00)

    // Exibe o total poupado
    escreva("Total poupado: R$ ", total:0:2)
fimalgoritmo

 */
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar a quantidade de moedas de cada tipo
        int moedas1, moedas5, moedas10, moedas25, moedas50, moedas1Real;
        double total;

        // Solicita ao usuário a quantidade de moedas de 1 centavo
        System.out.print("Digite a quantidade de moedas de 1 centavo: ");
        moedas1 = scanner.nextInt();

        // Solicita ao usuário a quantidade de moedas de 5 centavos
        System.out.print("Digite a quantidade de moedas de 5 centavos: ");
        moedas5 = scanner.nextInt();

        // Solicita ao usuário a quantidade de moedas de 10 centavos
        System.out.print("Digite a quantidade de moedas de 10 centavos: ");
        moedas10 = scanner.nextInt();

        // Solicita ao usuário a quantidade de moedas de 25 centavos
        System.out.print("Digite a quantidade de moedas de 25 centavos: ");
        moedas25 = scanner.nextInt();

        // Solicita ao usuário a quantidade de moedas de 50 centavos
        System.out.print("Digite a quantidade de moedas de 50 centavos: ");
        moedas50 = scanner.nextInt();

        // Solicita ao usuário a quantidade de moedas de 1 real
        System.out.print("Digite a quantidade de moedas de 1 real: ");
        moedas1Real = scanner.nextInt();

        // Calcula o total de dinheiro no cofrinho
        total = (moedas1 * 0.01) + (moedas5 * 0.05) + (moedas10 * 0.10) + 
                (moedas25 * 0.25) + (moedas50 * 0.50) + (moedas1Real * 1.00);

        // Exibe o total poupado
        System.out.printf("Total poupado: R$ %.2f%n", total);

        // Fecha o scanner
        scanner.close();
    }
}

