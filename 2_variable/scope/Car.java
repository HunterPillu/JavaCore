public class Car{
	
	
	public void goUp(){
	}
	
	public void goLeft(){
		System.out.println("going left");
		
	}
	
	public static void goDown(){
	}
	
	public void goRight(){
		
		System.out.println("going Right");
	}
	
	public static void main(String[] ds){
		
		System.out.println("car started");
		
		Car c = new Car();
		
		c.goRight()
		c.goLeft();
		
		c.goUp();	
	}
	
	
}


