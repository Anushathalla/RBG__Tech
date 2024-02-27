package inherdemo;

public class HDFCBank extends RBIBank
{
	HDFCBank()
	{
		System.out.println("cons of HDFCBank");
	}
	public static void main(String[] args) 
	{
		HDFCBank h1 = new HDFCBank();
		h1.CBillscore();
	}
void cBillscore()
{
	System.out.println("cons of HDFCBank is 750");
}
}
