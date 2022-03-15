package controller;

public class ThreadId_Exercicio_03 extends Thread {
	
	public ThreadId_Exercicio_03 (int[] vetor, int num) {
		this.vetor[] = vetor;
		this.num = num;
		
	}
	
	@Override
	public void run() {
		int i;
		
		double TempoInicial = System.nanoTime();
		
		if (num == 1) {
			
			for (i = 0 ; i < vetor.length; i++) {
				
			}
			
		double TempoFinal = System.nanoTime();
		double TempoTotal = TempoFinal - TempoInicial;
		
		System.out.println("O tempo total em 'for' foi de: " + TempoTotal);
		
		} 
		if (num == 2) {
			
			double TempoInicial = System.nanoTime();
			
			vetor.forEach();
			
			double TempoFinal = System.nanoTime();
			double TempoTotal = TempoFinal - TempoInicial;
			
			System.out.println("O tempo total em 'forEach' foi de: " + TempoTotal);
			
		}
		
	}
	
}
