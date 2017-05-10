
import java.io.*;

public class ReadWrite {
	
	
	
	public static void Writer( Account a){
		
		try{
			FileOutputStream fos = new FileOutputStream("C://Users//Administrator//Desktop//ATMuser.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(a);
			oos.flush();
			System.out.println("You have successfully exited");
			
		}catch(Exception e){
			
			e.printStackTrace();
		
		}
		
		
	}

}
