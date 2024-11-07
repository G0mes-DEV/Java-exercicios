/*
algoritmo "calcular_volume_caixa_dagua"
Var
    // Declaração de variáveis
real : raio, altura, volume
inicio
    // Entrada de dados
    escreva("Digite o raio da base da caixa d'água (em metros): ")
    leia(raio)
    escreva("Digite a altura da caixa d'água (em metros): ")
    leia(altura)

    // Cálculo do volume (fórmula do volume do cilindro: V = pi * r^2 * h)
    volume <- 3.14159 * (raio * raio) * altura

    // Saída do resultado
    escreva("O volume da caixa d'água é: ", volume, " metros cúbicos.")
fimalgoritmo

 */
import javax.swing.JOptionPane;

public class Ex11 {

    public static void main(String[] args) {
        // Declaração das variáveis
        double raio, altura, volume;
        final double PI = 3.14159;
        
        // Entrada de dados com JOptionPane
        String inputRaio = JOptionPane.showInputDialog("Digite o raio da base da caixa d'água (em metros):");
        raio = Double.parseDouble(inputRaio); // Converte para double
        
        String inputAltura = JOptionPane.showInputDialog("Digite a altura da caixa d'água (em metros):");
        altura = Double.parseDouble(inputAltura); // Converte para double
        
        // Cálculo do volume (fórmula do volume do cilindro: V = pi * r^2 * h)
        volume = PI * Math.pow(raio, 2) * altura;
        
        // Exibição do resultado com JOptionPane
        JOptionPane.showMessageDialog(null, "O volume da caixa d'água é: " + volume + " metros cúbicos.");
    }
}
