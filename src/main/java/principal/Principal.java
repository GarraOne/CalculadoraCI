package principal;

import calculadora.Calculadora;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String opcao = "";
        Calculadora calculadora = new Calculadora();
        while (!opcao.equals("9")) {
            opcao = JOptionPane.showInputDialog("1 - Leitura         2 - Adicao\n3 - Subtracao   4 - Multiplicação \n5 - Divisao         6 - Exponencial \n7 - Fatorial A        9 - Sair");
            switch (Integer.parseInt(opcao)) {
                case 1:
                    calculadora.setValorA(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor A")));
                    calculadora.setValorB(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor B")));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Soma: " + calculadora.getSoma());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Diferenca: " + calculadora.getDiferenca());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Produto: " + calculadora.getProduto());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Quociente: " + calculadora.getQuociente());
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Exponencial: " + calculadora.getExponencial());
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Fatorial: " + calculadora.getFatorial());
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Favor selecionar um numero dentro do padrão");
                    break;
            }
        }
    }
}
