import javax.swing.JOptionPane;

public class main{
    public static void main(String[] args) {
        // Pesos de cada ingrediente
        double pesoFatiaQueijo = 0.05; // em kg (50 gramas)
        double pesoFatiaPresunto = 0.05; // em kg (50 gramas)
        double pesoHamburguer = 0.1; // em kg (100 gramas)

        // Solicita o número de sanduíches a serem feitos usando JOptionPane
        String input = JOptionPane.showInputDialog("Digite a quantidade de sanduíches a fazer:");
        int quantidadeSanduiches = Integer.parseInt(input);

        // Cálculo da quantidade de cada ingrediente
        double quantidadeQueijo = 2 * pesoFatiaQueijo * quantidadeSanduiches;
        double quantidadePresunto = pesoFatiaPresunto * quantidadeSanduiches;
        double quantidadeCarne = pesoHamburguer * quantidadeSanduiches;

        // Cria a mensagem de saída com as quantidades em kg
        String mensagem = String.format(
            "Quantidade necessária de queijo: %.2f kg%n" +
            "Quantidade necessária de presunto: %.2f kg%n" +
            "Quantidade necessária de carne: %.2f kg",
            quantidadeQueijo, quantidadePresunto, quantidadeCarne
        );

        // Exibe a mensagem usando JOptionPane
        JOptionPane.showMessageDialog(null, mensagem);
}
    
}