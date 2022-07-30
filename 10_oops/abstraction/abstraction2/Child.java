public class Child extends Father{
	//America
	
	//override
	void language(){
		System.out.println("English");
	}
	

	public static void main(String[] args){
		
		Child cc = new Child();
		cc.language();
		cc.howHeWalks();
		
		
		//Father ff= new Father();
		
	}
	
}