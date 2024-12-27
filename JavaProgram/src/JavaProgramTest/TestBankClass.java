package JavaProgramTest;

public class TestBankClass {

	public static void main(String[] args) {

		HDSFBank hb = new HDSFBank();
		hb.loan();
		hb.credit();
		hb.debit();
		hb.funds();
		
		AbstractClass obj = new  HDSFBank();
		
		obj.loan();
		obj.credit();
		obj.debit();
		
	}

}
