public class C extends B{
	
	public void speak(){
		System.out.println("class CCCC");
	}
	
	public void speak(int a , int b){
		int d = a*b;
		System.out.println(d);
	}	
	
	public void speak(String a , int b){
		String d = a+b;
		System.out.println(d);
	}
	
	public void speak2(String a , int b){
		String d = a+b;
		System.out.println(d);
	}
	
	
	public void speak(int a , int b , int c){
		//super.speak(a,b,c);
		int d = a+b+c;//2+3+4
		System.out.println(d); //9
	}
	
	
	public static void main(String[] args){
		
		A aa = new A();
		aa.speak();
		
		//B bb = new B();
		//bb.speak();
		
		C cc = new C();
		cc.speak();
		cc.speak(1,1);
		cc.speak(2,3,4);
		cc.speak("test",7);
		
	}
}