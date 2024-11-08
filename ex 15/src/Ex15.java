/*

var
    // Declaração de variáveis
    real a, b, x
inicio 
    // Leitura dos coeficientes
    escreva("Digite o valor de a: ")
    leia(a)
    escreva("Digite o valor de b: ")
    leia(b)
    
    // Cálculo do ponto de interseção no eixo X (onde Y = 0)
    x := -b / a
    
    // Exibição do resultado
    escreva("A reta toca o eixo X no ponto X = ", x)
fimalgoritmo

 */
import javax.swing.JOptionPane;

public class Ex15 {
    public static void main(String[] args) {
        // Leitura dos coeficientes a e b
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a (coeficiente angular):"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b (coeficiente linear):"));
        
        // Cálculo do ponto de interseção no eixo X (onde Y = 0)
        double x = -b / a;
        
        // Exibição do resultado
        JOptionPane.showMessageDialog(null, "A reta toca o eixo X no ponto X = " + x);
    }
}

