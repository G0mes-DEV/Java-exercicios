/*
var
    // Declaração das variáveis
    inteiro qtd_grande, qtd_medio, qtd_pequeno, tempo_empresa
    inteiro total_pontos
inicio
    // Leitura da quantidade de projetos em que o funcionário atuou e tempo de casa
    escreva("Digite a quantidade de projetos de grande porte: ")
    leia(qtd_grande)
    
    escreva("Digite a quantidade de projetos de médio porte: ")
    leia(qtd_medio)
    
    escreva("Digite a quantidade de projetos de pequeno porte: ")
    leia(qtd_pequeno)
    
    escreva("Digite o tempo de empresa (em anos): ")
    leia(tempo_empresa)
    
    // Cálculo do total de pontos acumulados
    total_pontos <- (qtd_grande * 10) + (qtd_medio * 5) + (qtd_pequeno * 2) + (tempo_empresa * 2)
    
    // Exibição do total de pontos acumulados
    escreva("O total de pontos acumulados é: ", total_pontos)
fimalgoritmo

 */
import javax.swing.JOptionPane;

public class Ex16 {
    public static void main(String[] args) {
        // Leitura dos dados de entrada
        int qtdGrande = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de projetos de grande porte:"));
        int qtdMedio = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de projetos de médio porte:"));
        int qtdPequeno = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de projetos de pequeno porte:"));
        int tempoEmpresa = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de empresa (em anos):"));

        // Cálculo dos pontos
        int totalPontos = (qtdGrande * 10) + (qtdMedio * 5) + (qtdPequeno * 2) + (tempoEmpresa * 2);

        // Exibição do resultado
        JOptionPane.showMessageDialog(null, "O total de pontos acumulados é: " + totalPontos);
    }
}
