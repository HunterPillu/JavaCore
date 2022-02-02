public class If_int{
	
	int i =9;
	
	public void nonModule(){
	}
	
	public static void module()
		{
			int k=120;
			
			int intdivisibleby10=k%10;
			//int intdivisiblebye5=k%5;
			//int intdivisiblebye7=k%7;
			
			System.out.println("is dividible="+intdivisibleby10);
			
			if(intdivisibleby10==0)
			{
				System.out.println(" ****intdivisibleby10****");
			}
		}
	
	static public void main(String...a)
	{
		module();
		If_int ff =new If_int();
		 ff.nonModule();
		int i =10;
		boolean b=i>=60;
		module();
		 ff.nonModule();
		System.out.println(b);
		
		ff.nonModule();
		if(i>9)
		{
			System.out.println("yes condition is true & value is 10");
			module();
		
		}
		
		ff.nonModule();
		
		module();
		
		 
	
	}
	
		
}	