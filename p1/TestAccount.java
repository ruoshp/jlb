import java.util.*;
class Account
{
	Scanner a = new Scanner(System.in);
	int accno;
	String name;
	int pno;
	float bal_amt;
	Account(int accno,String name,int pno)
	{
		this.accno = accno;
		this.name = name;
		this.pno = pno;
	}
	void deposit()
	{
		System.out.println("enter amount to be deposited");
		bal_amt = a.nextFloat();
	}
	void withdraw()
	{
		int i =0;
		while(i==0){
		System.out.println("enter amount to withdraw");
		float w = a.nextFloat();
		if(w>bal_amt)
			System.out.println("Withdrawal cannot be greater than balance amount");
		else
		{
			bal_amt=bal_amt-w;
			System.out.println("Amount withdrawn = "+w);
			i=1;
		}
		}
	}
	void display()
	{
		if(bal_amt<10000)
		{
			System.out.println("Account number : "+accno);
			System.out.println("Name : "+name);
			System.out.println("Phone number : "+pno);
			System.out.println("Balance amount : "+bal_amt);
			System.out.println();
		}
	}
}
class TestAccount
{
	public static void main(String args[])
	{
		Scanner a = new Scanner(System.in);
		System.out.println("Enter number of employees");
		int n = a.nextInt();
		Account obj[]= new Account[n];
		int accno;
		String name;
		int pno;
		for(int i =0;i<n;i++)
		{
			System.out.println("Enter details for employee no "+(i+1));
			System.out.println("enter account no");
			accno = a.nextInt();
			System.out.println("enter name");
			name = a.next();
			System.out.println("enter phone number");
			pno = a.nextInt();
			obj[i]=new Account(accno,name,pno);
			obj[i].deposit();
			System.out.println();
		}
		for(int i =0;i<n;i++)
		{
			System.out.println("Withdrawal for employee "+(i+1));
			obj[i].withdraw();
			System.out.println();
		}
		System.out.println("Details of employee whose account balance is less than 10000\n");
		for(int i =0;i<n;i++)
			obj[i].display();
	}
}