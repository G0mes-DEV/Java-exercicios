/*
var
    // Declarando as variáveis
    cadeia nome1, nome2, nome3
    inteiro pontos1, pontos2, pontos3
    real premio1, premio2, premio3, total_pontos
inicio
    // Lendo o nome e os pontos dos três participantes
    escreva("Digite o nome do primeiro participante: ")
    leia(nome1)
    escreva("Digite os pontos do primeiro participante: ")
    leia(pontos1)

    escreva("Digite o nome do segundo participante: ")
    leia(nome2)
    escreva("Digite os pontos do segundo participante: ")
    leia(pontos2)

    escreva("Digite o nome do terceiro participante: ")
    leia(nome3)
    escreva("Digite os pontos do terceiro participante: ")
    leia(pontos3)

    // Calculando o total de pontos
    total_pontos := pontos1 + pontos2 + pontos3

    // Calculando a proporção do prêmio para cada participante
    premio1 := (pontos1 / total_pontos) * 500000
    premio2 := (pontos2 / total_pontos) * 500000
    premio3 := (pontos3 / total_pontos) * 500000

    // Exibindo os resultados
    escreva(nome1, " receberá R$ ", premio1:0:2, " de prêmio.", "\n")
    escreva(nome2, " receberá R$ ", premio2:0:2, " de prêmio.", "\n")
    escreva(nome3, " receberá R$ ", premio3:0:2, " de prêmio.", "\n")

fimalgoritmo

 */
import javax.swing.JOptionPane;

public class Ex12 {
    public static void main(String[] args) {
        // Declarando as variáveis
        String nome1, nome2, nome3;
        int pontos1, pontos2, pontos3;
        double premio1, premio2, premio3, totalPontos;

        // Lendo o nome e os pontos dos três participantes
        nome1 = JOptionPane.showInputDialog("Digite o nome do primeiro participante:");
        pontos1 = Integer.parseInt(JOptionPane.showInputDialog("Digite os pontos do primeiro participante:"));
        
        nome2 = JOptionPane.showInputDialog("Digite o nome do segundo participante:");
        pontos2 = Integer.parseInt(JOptionPane.showInputDialog("Digite os pontos do segundo participante:"));
        
        nome3 = JOptionPane.showInputDialog("Digite o nome do terceiro participante:");
        pontos3 = Integer.parseInt(JOptionPane.showInputDialog("Digite os pontos do terceiro participante:"));

        // Calculando o total de pontos
        totalPontos = pontos1 + pontos2 + pontos3;

        // Calculando a proporção do prêmio para cada participante
        premio1 = (pontos1 / totalPontos) * 500000;
        premio2 = (pontos2 / totalPontos) * 500000;
        premio3 = (pontos3 / totalPontos) * 500000;

        // Exibindo os resultados
        String resultado = nome1 + " receberá R$ " + String.format("%.2f", premio1) + " de prêmio.\n" +
                           nome2 + " receberá R$ " + String.format("%.2f", premio2) + " de prêmio.\n" +
                           nome3 + " receberá R$ " + String.format("%.2f", premio3) + " de prêmio.";

        JOptionPane.showMessageDialog(null, resultado);
    }
}
