public class Scope{

	
	int i;
	int j;
	int k =10;
	
	private String password = "abc@135"; //class level scope
	
	protected String address = "Delhi"; //package level scope
	
	public String key = "public key";
	
	
	
	static int TYPE = 34;
	
	
	static int MEDIA_CODE = 9090;
	
	
	public static void main(String[] args){
		
		int jj;
		
		Scope ss =new Scope(); //creating object
		Scope ss1 =new Scope(); //creating object
		
		System.out.println(ss);
		System.out.println(ss1);
		
		System.out.println(ss.mAge);
		
		System.out.println(TYPE);
		System.out.println(ss.TYPE);
		System.out.println(ss.TYPE);
		
		
		ss.main2();
		
		main3();
				
	}
	
	int mAge = 11;  //Class level scope
	
	
	public void main2(){
		
		int j;
		
		Scope ss =new Scope(); 
		
		System.out.println("inside main2");
		
	}
	
	public static void main3(){
		System.out.println("inside main3");
		
	}

	
}
