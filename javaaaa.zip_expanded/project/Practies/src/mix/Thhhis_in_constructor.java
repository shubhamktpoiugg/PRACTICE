package mix;

public class Thhhis_in_constructor {

	int a;
	public static void main(String[] args) {
		
		
		 Thhhis_in_constructor t = new Thhhis_in_constructor(10);
				 t.m2();
		
				 
	}
	Thhhis_in_constructor(int a)
	{
		this.a=a;
		System.out.println(a);
		
	}
	
	public void m2()
	{
		System.out.println(a);
	}
	
	
}	

