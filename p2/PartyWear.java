package package2;

import java.util.Scanner;

import package1.FormalShirt;

public class PartyWear extends FormalShirt {
	Scanner a = new Scanner(System.in);
	String brand;
	public PartyWear(String size, double price) {
		// TODO Auto-generated constructor stub
		super(size,price);
		System.out.println("Enter brand name");
		this.brand=a.next();
		display();
	}
	void display() {
		System.out.println("Brand Name : "+brand);
	}
}

