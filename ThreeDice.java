
public class ThreeDice 
{
	dice D1;
	dice D2;
	dice D3;
	ThreeDice(int Bounces)
	{
		D1 = new dice(Bounces);
		D2 = new dice(Bounces);
		D3 = new dice(Bounces);
	}
	
	public int Throw()
	{
		return((D1.Throw()+D2.Throw()+D3.Throw())/3);
		
	}
	
}
