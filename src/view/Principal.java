/*
 * Exercício de recursividade, soma de divisão crescente.
 * versão 1.0
 * data 17/08/2025
 * programador Henrique Foganholi de Oliveira
 */

package view;
import controller.SomaDivisaoCrescenteController;
import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		SomaDivisaoCrescenteController controle = new SomaDivisaoCrescenteController();
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Escolha um valor para o cálculo: "));
		double resultado = controle.somatoria(numero);
		JOptionPane.showMessageDialog(null, "A somatória é: " + resultado);
		
	}
	

}
