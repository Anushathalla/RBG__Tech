package inherdemo;

public class RBIBankTest2 
{
	public static void main(String[] args)
	{
	RBIBank r1 = new RBIBank();
	r1.CBillscore();
	
	RBIBank r2 = new HDFCBank();// up casting 
	r2.CBillscore();

}
}