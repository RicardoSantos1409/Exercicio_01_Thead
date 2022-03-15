package controller;

public class ThreadId_Exercicio_01 extends Thread {

	private int idThread; 
	
	public ThreadId_Exercicio_01 (int idThread) {
		this.idThread = idThread;
	}

	@Override
	public void run() {
		
		System.out.println("TID #" + getId() + " ==> " + idThread);
		
	}
	
	
	
}
