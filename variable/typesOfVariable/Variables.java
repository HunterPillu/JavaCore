public class Variables{
	
	static int gate =2;
	
	int watchman = 1;  //to access this variable we need to create instnace of the class
	int doctor =6; 
	
	
	public static void main(String[] args){
		System.out.println("inside main method");
		
		int tv = 9;  //local variable for main method
		
		
		System.out.println(tv);
		

		//new Variables();

		String str = new  String();
		
		//System ss = new System();

		HelloWorld hw=new HelloWorld();
		HelloWorld hw2=new HelloWorld();
		
		Variables v = new Variables();
		System.out.println(v.doctor);

		System.out.println(str);
		System.out.println(hw);
		System.out.println(hw2);
		System.out.println(v);

		//System.out.println(hw.age);
		//hw.age = 70;
		System.out.println(hw.rollnumber);
		hw.rollnumber=80;
		System.out.println(hw.rollnumber);
		//System.out.println(hw.age);
		//System.out.println(hw2.age);
		System.out.println(hw2.rollnumber);



		//main3();
		
		System.out.println("ending main method");
	}
	
	public static void main2(){
		System.out.println("inside main-2");
		
		int k =99;
		
		//System.out.println(gate);

		System.out.println("ending main-2 method");
	}
	
	
	
	public static void main3(){
		System.out.println("inside main-3");

		main2();

		System.out.println("ending main-3 method");
	}
	
	
	public static void main4(){
		
	}
}