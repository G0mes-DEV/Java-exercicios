/*

var
 valor_compra1, valor_compra2, valor_compra3, valor_compra4, total_gasto, pontos : real

inicio
    // Ler os valores das quatro compras
    escreva("Digite o valor da primeira compra: ")
    leia(valor_compra1)
    
    escreva("Digite o valor da segunda compra: ")
    leia(valor_compra2)
    
    escreva("Digite o valor da terceira compra: ")
    leia(valor_compra3)
    
    escreva("Digite o valor da quarta compra: ")
    leia(valor_compra4)
    
    // Calcular o total gasto
    total_gasto = valor_compra1 + valor_compra2 + valor_compra3 + valor_compra4
    
    // Calcular os pontos acumulados (1 ponto para cada 5 reais)
    pontos = total_gasto / 5
    
    // Exibir o total de pontos
    escreva("O total de pontos acumulados é: ", pontos)
fimalgoritmo

 */
import javax.swing.JOptionPane;

public class Ex13{
    public static void main(String[] args) {
        // Ler os valores das compras
        double valorCompra1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da primeira compra:"));
        double valorCompra2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da segunda compra:"));
        double valorCompra3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da terceira compra:"));
        double valorCompra4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da quarta compra:"));

        // Calcular o total gasto
        double totalGasto = valorCompra1 + valorCompra2 + valorCompra3 + valorCompra4;

        // Calcular os pontos acumulados (1 ponto para cada 5 reais)
        double pontos = totalGasto / 5;

        // Exibir o total de pontos acumulados
        JOptionPane.showMessageDialog(null, "O total de pontos acumulados é: " + pontos);
    }
}

