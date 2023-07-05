package Exercise01;

public class Main {
	public static void main(String[] args) {

		// Creo i due thread con associati i simboli
		Thread thread1 = new Thread(new stampaSimboli("!"));
		Thread thread2 = new Thread(new stampaSimboli("?"));

		// Avvio i 'thread figli con il metodo start() in cui al suo interno possiede il metodo run(), di cui ho fatto l'override per stampare in console i simboli
		thread1.start();
		thread2.start();
	}
}

class stampaSimboli implements Runnable {
	
	public String simbolo;

	public stampaSimboli(String simbolo) {
		this.simbolo = simbolo;
	}

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.print(simbolo);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
