package JavaProgramTest;

public class TestBank {

	public static void main(String[] args) {

		System.out.println(USBank.min_bal);
		
		HSBCBAnk hs= new HSBCBAnk();
		hs.carload();
		hs.credit();
		hs.debit();
		hs.eduloan();
		hs.carload();
		hs.mutualfund();
		
		System.out.println("**********");
		
		USBank b = new HSBCBAnk();
		b.credit();
		b.debit();
		b.transfmoney();
		
		
		
	
	}

}
