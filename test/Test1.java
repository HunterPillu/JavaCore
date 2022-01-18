public class Test1{
	
	static int[] a = {25,2,3,57,38,41};
	static int[] b = new int[10];
	static int maxCount=0;
	
	public static void increaseDigitCount(int num){
		b[num%10]++;
		if(b[num%10]>maxCount){
			maxCount=b[num%10];
		}
		if(num>9){
			increaseDigitCount(num/10);
		}
		
	}
	
	public static void main(String[] args){
		
		printGivenArray();
		
		for(int i=0;i<a.length;i++){
			increaseDigitCount(a[i]);
		}
		
		printOutputArray();
		
	}
	
	
	
	
	public static void printGivenArray(){
		System.out.println("Given Array is ...");
		
		for(int i=0;i<a.length;i++){
			System.out.print(" "+a[i]);
		}
	}
	
	public static void printOutputArray(){
		System.out.println("\nOutput Array is ...");
		System.out.print("[ ");
		for(int i=0;i<b.length;i++){
			if(b[i]==maxCount){
				System.out.print(i+" ");
			}
		}
		System.out.print("]");
	}

}