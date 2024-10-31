/*
VAR
HorasNo,HorasEx,SalarioBruto,SalarioLiquido
INICIO 

LER HorasNo
LER HorasEx 

SalarioBruto = (HorasNo * 10)+(HorasEx * 15)
SalarioLiquido = (SalarioBruto-(SalarioBruto * 0,1)) 

ESCREVA "O Salário Bruto do funcionário é "+SalarioBruto
ESCREVA "O Salário Líquido do funcionário é "+SalarioLiquido 

FIM 

Teste de Mesa 

| HorasNo | | HorasEx | | SalarioBruto | | SalarioLiquido | | ESCREVA | | ESCREVA |

 */

import javax.swing.JOptionPane;

public class ex04 {

    public static void main(String[] args) {
        double horasNo,horasEx,salarioBruto,salarioLiquido;

        String s_horasno,s_horasEx;

        s_horasno = JOptionPane.showInputDialog("Quantas horas você trabalhou? ");
        horasNo = Double.parseDouble(s_horasno);

        s_horasEx = JOptionPane.showInputDialog("Quantas horas extras você trabalhou? ");
        horasEx = Double.parseDouble(s_horasEx);

        salarioBruto =  (horasNo * 10)+(horasEx * 15);
        salarioLiquido = salarioBruto - (salarioBruto * 0.1);

        JOptionPane.showMessageDialog(null,"O Salário Bruto do funcionário é: " + salarioBruto);
        JOptionPane.showMessageDialog(null,"O Salário Líquido do funcionário é: " + salarioLiquido);

        
    }
}
