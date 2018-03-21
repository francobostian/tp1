
public class BeerHouse {

    private int valor = 50;
    private volatile boolean running = true;

    public synchronized void meter() {

	if (this.valor < 100) {
	    while (this.running == true) {
		try {
		    wait();
		} catch (InterruptedException e) {
		}
	    }
	    int Sumapintas = (int) (Math.random() * 29);

	    valor = valor + Sumapintas;
	    System.out.println("----- productor trajo " + Sumapintas + " pintas. - Quedan en total: " + valor);

	    this.running = true;
	    notifyAll();
	}
    }

    public synchronized void sacar(String nombre) {
	if (valor > 0) {

	    while (this.running == false) {
		try {
		    wait();
		} catch (InterruptedException e) {
		}
	    }
	    int tomarPinta = (int) (Math.random() * valor + 1);
	    // System.err.println(tomarPinta);
	    valor = valor - tomarPinta;
	    System.out.println(nombre + " consumió " + tomarPinta + " pintas. Quedan: " + valor);

	    this.running = false;

	    notifyAll();
	}
	// while (running) {
	// if (valor == 0) {
	// running = false;
	//
	// System.out.println("terminamos");
	// System.exit(0);
	// } else {
	// System.out.println("sacado un litro por " + nombre + ", el total es:
	// " + valor);
	// valor--;
	//
	// }
	// }
    }

}
