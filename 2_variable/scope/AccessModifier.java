public class AccessModifier{
	
	public static void main(String... args){

		System.out.println(Scope.TYPE);
		
		Scope ss = new Scope();
		System.out.println(ss.i);
		
		Scope.main3();
		
		
		ss.main2();
		
		
		//System.out.println(ss.password);
		System.out.println(ss.address);
		
	}		
	
	
}