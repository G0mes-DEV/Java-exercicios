/*
algoritmo "altura_predio"
    // Declaração das variáveis
var
    real h_pessoa, s_pessoa, s_predio, h_predio

inicio

    // Leitura dos dados
    escreva("Digite a altura da pessoa (em metros): ")
    leia(h_pessoa)
    escreva("Digite o comprimento da sombra da pessoa (em metros): ")
    leia(s_pessoa)
    escreva("Digite o comprimento da sombra do prédio (em metros): ")
    leia(s_predio)

    // Cálculo da altura do prédio
    h_predio <- (h_pessoa * s_predio) / s_pessoa

    // Exibe o resultado
    escreva("A altura do prédio é: ", h_predio, " metros.")
fimalgoritmo

 */
import javax.swing.JOptionPane;

public class Ex09 {

    public static void main(String[] args) {
        // Declaração das variáveis
        double hPessoa, sPessoa, sPredio, hPredio;

        // Leitura dos dados com JOptionPane
        hPessoa = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da pessoa (em metros):"));
        sPessoa = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento da sombra da pessoa (em metros):"));
        sPredio = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento da sombra do prédio (em metros):"));

        // Cálculo da altura do prédio
        hPredio = (hPessoa * sPredio) / sPessoa;

        // Exibição do resultado
        JOptionPane.showMessageDialog(null, "A altura do prédio é: " + hPredio + " metros.");
    }
}
