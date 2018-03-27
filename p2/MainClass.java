import java.util.Scanner;
import package1.*;
import package2.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		String size;
		double price;
		System.out.println("Enter Size : S/M/L");
		size=a.next();
		System.out.println("Enter price");
		price=a.nextDouble();
		System.out.println("\nPullOver Class");
		PullOver po = new PullOver(size, price);
		System.out.println("\nFormalShirt Class");
		FormalShirt fs = new FormalShirt(size, price);
		System.out.println("\nPartyWear Class");
		PartyWear pw = new PartyWear(size, price);
		
	}

}
