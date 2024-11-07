/*
var
    // Declaração de variáveis
    inteiro: total_refresco
    real : agua, suco

inicio
    // Leitura do total de refresco desejado
    escreva("Informe a quantidade de refresco (em litros): ")
    leia(total_refresco)

    // Cálculo da quantidade de água e suco
    agua <- (8 / 10) * total_refresco
    suco <- (2 / 10) * total_refresco

    // Exibição dos resultados
    escreva("Quantidade de água mineral: ", agua, " litros", "\n")
    escreva("Quantidade de suco de maracujá: ", suco, " litros", "\n")

fimalgoritmo

 */
import javax.swing.JOptionPane;

public class Ex10 {
    public static void main(String[] args) {
        // Declaração de variáveis
        double totalRefresco, agua, suco;

        // Entrada de dados utilizando JOptionPane
        String input = JOptionPane.showInputDialog("Informe a quantidade de refresco (em litros):");
        totalRefresco = Double.parseDouble(input);

        // Cálculo da quantidade de água e suco
        agua = (8.0 / 10.0) * totalRefresco;
        suco = (2.0 / 10.0) * totalRefresco;

        // Exibição dos resultados utilizando JOptionPane
        JOptionPane.showMessageDialog(null, 
            "Quantidade de água mineral: " + agua + " litros\n" +
            "Quantidade de suco de maracujá: " + suco + " litros",
            "Resultado do Cálculo", JOptionPane.INFORMATION_MESSAGE);
    }
}
