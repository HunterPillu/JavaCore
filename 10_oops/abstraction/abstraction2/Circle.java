public class Circle extends Shape{
	

	
	public double getArea(int radius){
		
		double result = 3.14 * radius*radius;
		return result;
	}
	
	
	
	public static void main(String[] args){
		
		Circle cc = new Circle();
		
		double area = cc.getArea(10);
		System.out.println(area);
		
	}
	
	
}