/*
var
 valor_cheque, valor_imposto, taxa_imposto : Real

    // Inicialização da taxa de imposto
    taxa_imposto <- 0,0038

    // Solicita o valor do cheque
    Escreva("Digite o valor do cheque: ")
    Leia(valor_cheque)

    // Calcula o valor do imposto a ser recolhido
    valor_imposto <- valor_cheque * taxa_imposto

    // Exibe o valor do imposto
    Escreva("O valor do imposto de CPF a ser recolhido é: ", valor_imposto)
Fim

 */
import javax.swing.*;

public class Ex14 {
    public static void main(String[] args) {
        // Declaração das variáveis
        double valorCheque, valorImposto, taxaImposto = 0.0038;
        
        // Solicita o valor do cheque através de uma caixa de diálogo
        String input = JOptionPane.showInputDialog("Digite o valor do cheque:");
        
        // Converte o valor recebido de String para double
        valorCheque = Double.parseDouble(input);
        
        // Calcula o valor do imposto
        valorImposto = valorCheque * taxaImposto;
        
        // Exibe o valor do imposto em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, "O valor do imposto de CPF a ser recolhido é: R$ " + String.format("%.2f", valorImposto));
    }
}
