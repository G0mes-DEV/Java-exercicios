/*
VAR 
anelchip,anelalimento,calculo: REAL


inicio
      Leia anelchip
      Leia anelalimento
      Escreva ("Qual a quantidade de aneis com chip")
      Escreva ("Qual a quantidade de aneis de alimento")
      calculo <- (anelchip * 4.00) + (anelalimento * 3.50)
      Escreva ("O valor total de aneis gastos na granja foi de " + calculo)

TESTE DE MESA 
ANELCHIP | ANELALIMENTO | CALCULO | ESCREVA
10             10           75         75
-10            10           -5         -5
0               0             0         0
 */
package ex.pkg05;

import javax.swing.JOptionPane;

public class Ex05 {

    public static void main(String[] args) {
         double anelchip,anelalimento,calculo;
         
         String s_anelchip, s_anelalimento;
         
         s_anelchip = JOptionPane.showInputDialog("Qual a quantidade de aneis com chip");
         anelchip = Double.parseDouble(s_anelchip);
         
         s_anelalimento = JOptionPane.showInputDialog("Qual a quantidade de aneis de alimento");
         anelalimento = Double.parseDouble(s_anelalimento);
         
         calculo = (anelchip * 4.00) + (anelalimento * 3.50);
         
         JOptionPane.showMessageDialog(null,"O valor total de aneis gastos na granja foi de R$" +calculo);
         
         
    }
    
}
