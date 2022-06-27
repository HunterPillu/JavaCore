public class B extends A{
	
	void addB(){
		System.out.println("add of class B");
	}
	
	
	
	
	public static void main(String[] aa){
		
		B bb= new B();
		bb.addB();
		bb.addA();
		bb.addC();
		bb.addD();
		
		System.out.println(bb.d);
		
		//boolean isB = bb instanceof C;
		
		//System.out.println(isB);
		
		//bb.C();
		
		//A.main(null);
		
	}
	
}
