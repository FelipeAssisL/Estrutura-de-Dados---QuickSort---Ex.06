package view;

import br.edu.fateczl.ordenacao.Ordenacao_Vetor;

public class Main {

	public static void main(String[] args) {
		int[] vetor = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		
		Ordenacao_Vetor ordenacao = new Ordenacao_Vetor();
		vetor = ordenacao.quickSort(vetor, 0, vetor.length-1);
		
		for(int valor: vetor) {
			System.out.print(valor);
			System.out.print(" ");
		}
	}
}
