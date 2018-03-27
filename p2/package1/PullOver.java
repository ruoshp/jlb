package package1;

import java.util.Scanner;

final public class PullOver extends Shirt {
	Scanner a = new Scanner(System.in);
	String has_hood;
	String has_stripes;
	String col;
	public PullOver(String size, double price) {
		// TODO Auto-generated constructor stub
		super(size,price);
		System.out.println("If shirt has hood ?");
		has_hood=a.next();
		System.out.println("If shirt has stripes ?");
		has_stripes=a.next();
		getColor();
		putColor();
		display();
	}
	@Override
	void getColor() {
		// TODO Auto-generated method stub
		System.out.println("Enter color");
		col=a.next();
	}

	@Override
	void putColor() {
		// TODO Auto-generated method stub
		this.color=col;
	}
	void display() {
		System.out.println("Size of shirt : "+size);
		System.out.println("Price of shirt : "+price);
		System.out.println("Color of shirt : "+color);
		System.out.println("If shirt has hood : "+has_hood);
		System.out.println("If shirt has stripes : "+has_stripes);
	}

}
