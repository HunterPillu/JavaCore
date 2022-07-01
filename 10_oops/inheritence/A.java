public class A extends C{
	
	void addA(){
		System.out.println("add of class A");
	}
	
	void addA1(){
		System.out.println("add of class A1");
	}
	
	void addA2(){
		System.out.println("add of class A2");
	}
	
	public static void main(String[] args){
		A aa = new A();
		aa.addA();
		aa.addA1();
		aa.addA2();
	}


}