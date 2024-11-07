/*
var
    latas350ml, garrafas600ml, garrafas2L: inteiro
    totalLitros: real

inicio
    // Entrada de dados
    escreva("Digite a quantidade de latas de 350 ml: ")
    leia(latas350ml)

    escreva("Digite a quantidade de garrafas de 600 ml: ")
    leia(garrafas600ml)

    escreva("Digite a quantidade de garrafas de 2 litros: ")
    leia(garrafas2L)

    // Processamento
    totalLitros <- (latas350ml * 0.35) + (garrafas600ml * 0.6) + (garrafas2L * 2)

    // Saída de dados
    escreva("Total de litros comprados: ", totalLitros, " litros")
fimalgoritmo

 */
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar as quantidades de cada tipo de embalagem
        int latas350ml, garrafas600ml, garrafas2L;
        double totalLitros;

        // Solicita ao usuário a quantidade de latas de 350 ml
        System.out.print("Digite a quantidade de latas de 350 ml: ");
        latas350ml = scanner.nextInt();

        // Solicita ao usuário a quantidade de garrafas de 600 ml
        System.out.print("Digite a quantidade de garrafas de 600 ml: ");
        garrafas600ml = scanner.nextInt();

        // Solicita ao usuário a quantidade de garrafas de 2 litros
        System.out.print("Digite a quantidade de garrafas de 2 litros: ");
        garrafas2L = scanner.nextInt();

        // Calcula o total de litros comprados
        totalLitros = (latas350ml * 0.35) + (garrafas600ml * 0.6) + (garrafas2L * 2);

        // Exibe o total de litros comprados
        System.out.printf("Total de litros comprados: %.2f litros%n", totalLitros);

        // Fecha o scanner
        scanner.close();
    }
}
