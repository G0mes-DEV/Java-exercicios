package ex.pkg01;

import javax.swing.JOptionPane;

public class Ex01 {

    public static void main(String[] args) {
        
        double valorconta,valordividido,difereca;
        
        String s_valorconta;
        
        s_valorconta = JOptionPane.showInputDialog(null,"Insira o valor a ser pago: " );
        
        valorconta = Double.parseDouble(s_valorconta);
        
        valordividido = valorconta / 3;
        
        int valorsemcentavos = (int) valordividido;
        
        difereca = valorconta - (valorsemcentavos * 2 + valordividido);
        
        double carlos,andre,felipe;
        
        if (difereca > 0){
            felipe = valordividido + difereca;
        }
        else {
            felipe = valordividido;
        }
        
        JOptionPane.showMessageDialog(null,
                "Carlos pagará: R$ "+ valorsemcentavos +
                "\nAndré pagará: R$ "+ valorsemcentavos +
                "\nFelipe pagará: R$ "+ String.format("%.2f",felipe));
       

    }
    
}
