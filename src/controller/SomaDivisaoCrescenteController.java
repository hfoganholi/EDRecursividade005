/*
 * Exercício de recursividade, soma de divisão crescente.
 * versão 1.0
 * data 17/08/2025
 * programador Henrique Foganholi de Oliveira
 */

package controller;

public class SomaDivisaoCrescenteController {
	public SomaDivisaoCrescenteController() {
		
		super();
	}
	public double somatoria(int base) {
		// Condição de parada, representa 1 / 1.
		if (base == 1) {
			return 1;
		}
		// Resolução dos passos, diminuindo em 1 a função recursiva, e a adição
		// de double para garantir o cálculo da divisão com ponto flutuante.
		// Empilhando
		else {
			return ((double) 1 / base) + somatoria(base - 1);
		}
	}

}
