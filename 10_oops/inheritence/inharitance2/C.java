public class C extends A{
	
	
	public void printMsgC(){
		System.out.println("Message From class C");
	}
	
	public void printMsgA(){
		System.out.println("Message From class A");
	}
	
	
	public static void main(String[] a){
		
		C cc= new C();
		cc.printMsgA();
		
		//Tool tt = new Tool();//3
		Chair tt = new Chair(); //4
		tt.getTotalLegsCount();
		
	}
	
}