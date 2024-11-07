/*
var
    totalBlusas, totalNovelos : inteiro
    novelosPorBlusa : real

inicio
    // Definição da quantidade de novelos por blusa
    novelosPorBlusa := 2.5  // Exemplo: Cada blusa gasta 2.5 novelos de lã

    // Entrada de dados
    escreva("Digite a quantidade de blusas que serão produzidas: ")
    leia(totalBlusas)

    // Cálculo do total de novelos
    totalNovelos := totalBlusas * novelosPorBlusa

    // Exibição do resultado
    escreva("A quantidade total de novelos necessária será: ", totalNovelos:0:2)

fimalgoritmo


*/
import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        // Variáveis
        int totalBlusas;
        double novelosPorBlusa = 2.5;  // Exemplo: Cada blusa gasta 2.5 novelos
        double totalNovelos;

        // Criação do objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a quantidade de blusas que serão produzidas: ");
        totalBlusas = scanner.nextInt();

        // Cálculo do total de novelos
        totalNovelos = totalBlusas * novelosPorBlusa;

        // Exibição do resultado
        System.out.printf("A quantidade total de novelos necessária será: %.2f%n", totalNovelos);

        // Fechando o Scanner
        scanner.close();
    }
}
