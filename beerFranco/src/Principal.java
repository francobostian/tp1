
public class Principal {

    public static void main(String[] args) {
	BeerHouse cj = new BeerHouse();
	BeerProducer p = new BeerProducer(cj);
	BeerConsumer c = new BeerConsumer(cj, "uno");
	BeerConsumer c1 = new BeerConsumer(cj, "dos");
	BeerConsumer c2 = new BeerConsumer(cj, "tres");

	p.start();
	c1.start();
	c2.start();

	c.start();
    }

}
