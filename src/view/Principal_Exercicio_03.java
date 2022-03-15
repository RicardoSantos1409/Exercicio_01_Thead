package view;

import controller.ThreadId_Exercicio_03;

public class Principal_Exercicio_03 {

	public static void main(String[] args) {

		int vetor[] = new int [1000], i, um=1, dois=2;
		
		for (i = 0 ; i < 1000 ; i++) {
			vetor[i] = (int) ((Math.random() + 1) * 100);
		}
		
		Thread ThreadVetor1 = new ThreadId_Exercicio_03(vetor, um);
		ThreadVetor1.start();

		Thread ThreadVetor2 = new ThreadId_Exercicio_03(vetor, dois);
		ThreadVetor2.start();
		
	}

}
