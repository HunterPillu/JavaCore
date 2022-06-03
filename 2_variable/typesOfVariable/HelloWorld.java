class HelloWorld{
	
	 int age =60;
	static int rollnumber =2;
	

	public HelloWorld(){
		//default constructor
		//primary constructor
		System.out.println("inside Default constructor");
	}



	//secondary constructor
	public int HelloWorld(){
		return 9;
	}


	public void simple(){

	}

	
	
	static public void main(String[] args){
		
		System.out.println("Hello World");
		System.out.println("Hello World");
		//System.out.println(args[0]);


		int j= 10;

		HelloWorld hw = new HelloWorld();
		hw.age=78*2;
		rollnumber=90;
		
		System.out.println(hw.age);
		
	}


	
	
}