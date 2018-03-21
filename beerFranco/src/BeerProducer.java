
public class BeerProducer extends Thread {
    BeerHouse c;

    public BeerProducer(BeerHouse nc) {
	c = nc;
    }

    public void run() {
	int i;
	for (i = 1; i <= 100 && i > 0; i++) {
	    c.meter();

	    try {
		Thread.sleep(100);
	    } catch (InterruptedException e) {
	    }

	}
    }
}
