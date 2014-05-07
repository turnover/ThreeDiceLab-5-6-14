import java.util.Random;

public class dice 
{
	int num1;//value
	int total;
	int num2;//newValue
	int Bounces;
	int num3;//newBounces
	
	static Random random = new Random();
	
	public dice(int Bounces)
	{
		this.Bounces = Bounces;
	}
	
	public int Throw(int Bounces)
	{
		for(int i=Bounces; i>0; i--)
		{
			System.out.println(num1);
		}
		num1=num1/Bounces;
		return num1;
	}
	
	public int Throw()
	{
		num2=random.nextInt(6)+1;
		return num2;
	}
}
