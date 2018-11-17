package Assignment;

public class Single {
	private static Single single;
	private Single()
//hidden other classes to create an object for this class
	{      }
	
	public static Single getInstance()
	{
		if(null==single)
		{
			single = new Single();
	    }
		return single;
	}
}
