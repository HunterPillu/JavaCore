public class SemiCircle extends Shape{
	int j = 90;
	public void getMyName(){
		System.out.println("My Name is Anthony");
		
	}
	
	public double getArea(int radius){
		
		double result = 3.14 * radius*radius /2;
		return result;
	}
	
	
	
	public static void main(String[] args){
		
		SemiCircle cc = new SemiCircle();
		
		double area = cc.getArea2(10);
		System.out.println(area);
		
	}
	
	
}