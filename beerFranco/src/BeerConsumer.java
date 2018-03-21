
public class BeerConsumer extends Thread {
    BeerHouse c;
    String nombre;

    public BeerConsumer(BeerHouse nc, String nombre) {
	c = nc;
	this.nombre = nombre;
    }

    public BeerConsumer(BeerHouse c) {
	super();
	this.c = c;
    }

    public void run() {
	int i;
	for (i = 1; i <= 100 && i > 0; i++) {

	    c.sacar(this.nombre);
	    // try {
	    // Thread.sleep(50);
	    // } catch (InterruptedException e) {
	    // }
	}
	System.out.println("no hay mas cerveza.");
	System.exit(0);
    }
}
