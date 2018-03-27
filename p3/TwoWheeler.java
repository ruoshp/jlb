import java.util.Scanner;

public class TwoWheeler extends Vehicle {
	Scanner a = new Scanner(System.in);
	String brand;
	String model;
	double cc;
	public TwoWheeler(int year) {
		// TODO Auto-generated constructor stub
		super(year);
		getData();
		putData();
	}
	@Override
	void getData() {
		// TODO Auto-generated method stub
		System.out.println("Enter Brand");
		brand=a.next();
		System.out.println("Enter model");
		model=a.next();
		System.out.println("Enter CC");
		cc=a.nextDouble();
	}

	@Override
	void putData() {
		// TODO Auto-generated method stub
		System.out.println("Brand : "+brand);
		System.out.println("Model : "+model);
		System.out.println("Year of manufacture : "+year_of_manufacture);
		System.out.println("CC : "+cc);
	}

}
