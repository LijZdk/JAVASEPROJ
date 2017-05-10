
class Account implements java.io.Serializable {
	
	//Class Variables
	private String Holdername;
	private Double Balance;
	private int pin;
	private int account_number;
	private String bank;
	private String account_Type = "Normal";
        
        public Account(String hn, Double b, int p, int an, String bnk){
            String Holdername = hn;
            Double Balance = b;
            int pin = p;
            int account_number = an;
            String bank = bnk;
 
        }

	public String getHoldername() {
		return Holdername;
	}


	public void setHoldername(String holdername) {
		Holdername = holdername;
	}


	public Double getBalance() {
		return Balance;
	}


	public void setBalance(Double balance) {
		Balance = balance;
	}


	
	public void setPin(int pin) {
		this.pin = pin;
	}


	public int getAccount_number() {
		return account_number;
	}


	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}


	public String getBank() {
		return bank;
	}


	public void setBank(String bank) {
		this.bank = bank;
	}
	
	public String getAccountType(){
		
		return this.account_Type;
		
	}
	

}
