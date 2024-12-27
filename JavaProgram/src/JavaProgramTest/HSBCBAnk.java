package JavaProgramTest;

public class HSBCBAnk implements USBank,BrazilBank{

	@Override
	public void credit() {
		System.out.println("hsbc credit");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("hsbc debit");
	}
	

	@Override
	public void transfmoney() {
		System.out.println("hsbc transfer money");
		
	}
	
	public void eduloan()
	{
		System.out.println("hsbc edu loan");
	}
	public void carload()
	{
		System.out.println("hsbc car loan");
	}

	@Override
	public void mutualfund() {
		System.out.println("BRazil mutual fund-hsbc");
	}
	

}
