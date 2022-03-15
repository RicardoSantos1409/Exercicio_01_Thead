package view;

import controller.ThreadId_Exercicio_01;

public class Principal_Exercicio_01 {

	public static void main(String[] args) {

		for (int idThread = 0 ; idThread < 5 ; idThread++) {

			Thread threadId = new ThreadId_Exercicio_01(idThread);
			threadId.start();
			
		}
		
	}

}
