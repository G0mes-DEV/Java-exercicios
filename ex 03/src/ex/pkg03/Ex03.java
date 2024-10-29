package ex.pkg03;

import javax.swing.JOptionPane;

public class Ex03 {

    public static void main(String[] args) {
        double cel,form;
        
        String s_cel;
        
        s_cel = JOptionPane.showInputDialog("Digite a temperatura em Celsius");
        cel = Double.parseDouble(s_cel);
        
        form = (cel * 9/5) + 32;
        
        JOptionPane.showMessageDialog(null,"Transfrormando celsius para Fahrenheit = " + form);
        
    }
    
}
