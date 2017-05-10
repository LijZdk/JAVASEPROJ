
public class Student extends Account{
	
	private final String account_Type = "Student Account";

        public Student(String hn, Double b, int p, int an, String bnk) {
        
            super(hn, b, p, an, bnk);
        
        }
	
	
	public String getAccountType(){
		
		return account_Type;
		
	}

}
