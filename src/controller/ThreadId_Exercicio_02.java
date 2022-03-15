package controller;

public class ThreadId_Exercicio_02 extends Thread {
	
	public ThreadId_Exercicio_02() {
	
	
	}

	@Override
	public void run() {
		
		int matriz[][] = new int[3][5], i, j, soma=0;
		
		for (i = 0 ; i < 3 ; i ++) {
			for (j = 0 ; j < 5 ; j ++) {
				matriz[i][j] = 2;
			}
		}
		
		for (i = 0 ; i < 3 ; i ++) {
			soma = 0;
			for (j = 0 ; j < 5 ; j ++) {
				soma += matriz[i][j] ;
			}
			System.out.println("A soma da " + (i+1) + "º linha é: " + soma);
		}

		
	}	
}
