package inherdemo;

public class ToStringDemo1A 
{
 int a = 10;
 String s1 = "RbG technologies";
 
	public static void main(String[] args)
	{
System.out.println("main method start");

ToStringDemo1 t1 = new ToStringDemo1();

System.out.println(t1);
System.out.println("Done");
	}	
public String toString()
{
	System.out.println("tostring of ToStringDemo1");
	return s1 +" "+a;
}
}
