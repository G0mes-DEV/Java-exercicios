/*
VAR
prequeijo,carne:REAL
quantidade:INTEIRO

INICIO

ler quantidade 
escreva ("Digite a quantidade de lanches")
prequeijo <- (0,05 * quantidade)
carne <- (0,1 * quantidade)
escreva (prequeijo)
escreva (carne)

FIM

*/
package ex.pkg02;

import javax.swing.JOptionPane;


public class Ex02 {

    public static void main(String[] args) {
        double prequeijo,carne;
        int quantidade;
        
        String s_quantidade;
        
        s_quantidade = JOptionPane.showInputDialog("Digite a quantidade de lanches");
        quantidade = Integer.parseInt(s_quantidade);
        
        prequeijo = (0.05 * quantidade);
        carne = (0.1 * quantidade);
        
        JOptionPane.showMessageDialog(null,"A quantidade de carne é KG " +carne+ " e a de presento e queijo é KG "+prequeijo);
        
    }
    
}
