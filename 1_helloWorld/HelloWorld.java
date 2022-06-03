public class HelloWorld{

	public int age =60;

	public HelloWorld(){
		//default constructor
		//primary constructor
		System.out.println("inside Default constructor");
	}


	//secondary constructor
	public int HelloWorld(){
		return 9;
	}
	
	static public void main(String[] args){
		
		System.out.println("Hello World");
		System.out.println("Hello World");
		//System.out.println(args[0]);


		HelloWorld hw = new HelloWorld();
		System.out.println(hw);
		
	}
	
}