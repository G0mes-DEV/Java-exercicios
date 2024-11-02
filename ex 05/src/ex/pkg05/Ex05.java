/*
VAR
anelchip,anelalimento,frango,custo: REAL

INICIO
String frango
Escreva ("Quantos frangos existem na granja")

*/
package ex.pkg05;

import javax.swing.JOptionPane;

public class Ex05 {

    public static void main(String[] args) {
        double anelchip,anelalimento,frango,custo;
       
        String sfrango;
        sfrango = JOptionPane.showInputDialog(null, "Quanto frango existem na granja?");
        frango = Double.parseDouble(sfrango);

        anelchip = frango * 4;
        anelalimento = (frango * 3.5) * 2;
        custo = anelchip + anelalimento;

        JOptionPane.showMessageDialog(null,"A granja terá que gastar " + custo + "R$ com anéis.");
    }
    
}
