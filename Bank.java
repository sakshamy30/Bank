import java.util.*;
class Bank
{
	int withdraw;
	static int balance = 10000;
	public void balance() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("=========================================================");
		System.out.println("Customer Name is Anil");
		System.out.println("=========================================================");
		System.out.println("Do You Want To Check Your Bank Balance? \nType Y or N");
		String choice1 = sc.next();
		if(choice1.equals("Y"))
		{
			System.out.println("Your Current Balance is: "+balance+"rs");
		}
		else if(choice1.equals("N"))
		{
			System.out.println("Ok Thanks");
		}
		else
		{
			System.out.println("Invalid Input");
		}
		System.out.println();
		System.out.println("Do You Want To Withdraw Cash? \nType Y or N");
		String choice2 = sc.next();
		if(choice2.equals("Y"))
		{
			System.out.println("Enter the Amount you want to Withdraw:");
			withdraw = sc.nextInt();
			System.out.println();
			if(balance >= withdraw)
			{
				System.out.println("You Can Withdraw the Money :)");
				System.out.println();
				balance = balance - withdraw;
				System.out.println("Your current Balance is: "+balance+"rs");
			}
			else
			{
				System.out.println("Sorry Insufficient Balance :(");
			}
		}
		else if(choice2.equals("N"))
		{
			System.out.println();
			System.out.println("OK Bye Have a Nice Day!!!");
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
	public static void main(String[] args) 
	{
		Bank bank = new Bank();
		bank.balance();
	}
}