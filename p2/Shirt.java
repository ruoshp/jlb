package package1;

public abstract class Shirt {
	String size;
	double price;
	String color;
	public Shirt(String s, double p) {
		// TODO Auto-generated constructor stub
		this.size=s;
		this.price=p;
	}
	abstract void getColor();
	abstract void putColor();
}
