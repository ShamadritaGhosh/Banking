import java.util.Scanner;
class Deposit
{
	private static int amount;
	//adding the amount into account
	public static void depositAmount(int amt)
	{
		amount+=amt;
	}
	//updating the new amount after withdraw
	public static void depositAmount(int amt,int temp)
	{
		amount=amt;
	}
	//To access the account balance
	public static int getAmount()
	{
		return amount;
	}
}
class Balance
{
	//Showing current balance
	public static void checkAmount()
	{
		System.out.println("Your current balance="+Deposit.getAmount());
	}
}
class WithDraw
{
	public static void deductAmt()
	{
		int w_amt;
		System.out.print("Please enter your amount:");
		Scanner sc=new Scanner(System.in);
		w_amt=sc.nextInt();
		int currentAmt=Deposit.getAmount();
		//if mentioned amount is present in account
		if(w_amt<currentAmt)
		{
			Deposit.depositAmount(currentAmt-w_amt,1);
			System.out.println("Amount withdrawn successfully");
		}
		else//if mentioned amount is more than account balance
			System.out.println("Insuficient balance!!!");
	}
}
class Banking{
	public static void main(String[] args)
	{
		while(true)
		{
			int choice;
			System.out.println("\nTo deposit amount press 1\nTo withdraw amount press 2\nTo check balance press 3\nTo exit press 4");
			System.out.print("Enter your choice:");
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();
			//performing operation according user choice
			switch(choice)
			{
				case 1://DEPOSIT		
					int amt;
					System.out.print("Enter your amount:");
					amt=sc.nextInt();
					Deposit.depositAmount(amt);
					System.out.println("Amount deposited successfully");
					break;
				case 2://WITHDRAW
					WithDraw.deductAmt();
					break;
				case 3://BALANCE CHECKING
					Balance.checkAmount();
					break;
				case 4://TERMINATE
					System.exit(1);
				default://WRONG CHOICE
					System.out.println("Invalid choice!!!");
			}
		}
	
	}
}