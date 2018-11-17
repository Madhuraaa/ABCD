package Assignment;

public class Signleton {
	public static void main(String[] args)
	{
		Single single=Single.getInstance();
		System.out.println("hi");
		System.out.println(single.hashCode());
		Single single1=Single.getInstance();
		System.out.println("hlo");
		System.out.println(single1.hashCode());
		
	}

}
