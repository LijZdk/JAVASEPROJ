import java.util.*;
import java.io.*;


public class ATMc {

	static Scanner keyboard = new Scanner(System.in);
	static double deposit, withdraw, nBalance, oBalance;
	static int choice;
	static String filepath = "obj.txt";
	static Account acc1 = new Account("Elijah",300.0,1234,1408,"HSBC");;
    static ArrayList<Account> accounts = new ArrayList<Account>();
        
        
	public ATMc(){
		//accounts.add(acc1);
		//Read();
		//menu();
	}
	
	public static void Writer(Account a){

	
		try{
			FileOutputStream fos = new FileOutputStream(filepath);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(a);
			oos.close();
			System.out.println("You have successfully exited");
			
		}catch(Exception e){
			
			e.printStackTrace();
		
		}
		
		
	}
	public boolean checkAccNum(int acc){
		
		for (int i = 0; i < accounts.size(); i++){
			if (acc == accounts.get(i).getAccount_number()){
				
				return true;
				
			}
		}
		return false;
	}
        
	
	
	
	
	
	public static Account Read(){
		
			try{
			
			FileInputStream fileIn = new FileInputStream(filepath);
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			//String line = "";
			Account obj = (Account) objectIn.readObject();
			
			System.out.print("The Account user has been read from saving point");
			objectIn.close();
			accounts.add(obj);
			return (Account) obj;
			
			}catch(Exception e){
				
				e.printStackTrace();
				return null;
			}}
		
		

	public static int menu(){
		
		System.out.println("Choose an option from the menu");
		System.out.println("1. Withdraw");
		System.out.println("2. Deposit");
		System.out.println("3. Check balance");
		System.out.println("4. exit");
		
		choice = keyboard.nextInt();
		
		if(choice == 1){
			System.out.println("Give account number: ");
			int id = keyboard.nextInt();
			withdraw();
			menu();
			return 1;
			
		}
		if(choice == 2){
			Deposit();
			menu();
			return 2;
		}
		if(choice == 3){
			getMyBalance();
			menu();
			return 3;
			
		}
		 if (choice == 4){
			 //exit();
			 return 4;
		 }
		 if (choice <= 5){
			 System.out.println("System faliure");
			 menu();
			 return 5;
			 
		 }
		 if (choice > 1){
			 System.out.println("System faliure");
			 menu();
			 return 6;
		 }
		return choice;
		
		
	}
	
	
	public static void withdraw(){
	
			System.out.println("Enter value you would like to withdraw: ");
			double withdraw = keyboard.nextDouble();
			oBalance = acc1.getBalance();
			nBalance = oBalance - withdraw;
			acc1.setBalance(nBalance);
			System.out.println(" You withdrew �" + withdraw + " From your total balance of �" + oBalance + " and your new balance is �" + nBalance + ". ");
			
	
		

	}
	
	public static void getMyBalance(){
		
		System.out.println(" Your current balance is �" + acc1.getBalance());
		
	}
	
	public static void Deposit(){
		System.out.println("Enter the value you would like to deposit: ");
		double deposit = keyboard.nextDouble();
		oBalance = acc1.getBalance();
		nBalance = oBalance + deposit;
		acc1.setBalance(nBalance);
		System.out.println(" You withdrew �" + deposit + " From your total balance was �" + oBalance + " and your new balance is �" + nBalance + ". ");

	}
		
		
	}




