public class B extends A{
	
	
	
	public void printMsgB(){
		System.out.println("Message From class B");
	}
	
	
	//override 
	public void printMsgA(){
		System.out.println("Message From class BB");
	}
	
	
	
	//public static void main(String[] args){
		
		//B bb = new B();
		//bb.printMsg();
		
		//System.out.println(bb.j);
		//System.out.println(A.k);
		//System.out.println(B.k);
		//System.out.println(k);
		
	//}
	
	public static void main(String[] a){
		
		B cc= new B();
		cc.printMsgA();
		
	}
}