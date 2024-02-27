package inherdemo;

public class GrameenaBank extends ICICIBank
{
	public static void main(String[] args)
	{
		RBIBank r1 = new RBIBank();
		r1.CBillscore();
		
		GrameenaBank g1 = new GrameenaBank();
		g1.croploan();
	}
	void croploan()
	{
		System.out.println("croploan of GrameenaBank");
	}

}
