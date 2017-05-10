import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Writer;

public class tester {

	
	
	public static void main(String args[]){
		
		//Account acc1 = new Account("Elijah",300.00,1234,1408,"HSBC");
		ATMc atm = new ATMc();
		//System.out.println(atm.acc1.getAccountType());
		//atm.write(acc1);
		//atm.UserInsert();
		atm.menu();
		
		
		
	}
}
