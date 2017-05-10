
class Business extends Account{
	
	private String account_Type = "Business Account";

    public Business(String hn, Double b, int p, int an, String bnk) {
        super(hn, b, p, an, bnk);
    }

    public String getAccountType(){
		
	return account_Type;
		
    }

	
	
}
