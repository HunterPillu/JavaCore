public class IF{
		
	public static void main(String[] a){
		
		int i =49;
		
		boolean b = i >= 50;
		System.out.println(b);
		
		if(i<40){
			
			int j =89;
			
			System.out.println("*****yes condition is true and value is 50 *****");
			
		}
	
		
		
		
		////
		
		int k = 125 ;
		
		int isDivisbleBy10 = k%10; 
		int isDivisbleBy5 = k%5; 
		int isDivisbleBy3  = k%3;
		int isDivisbleBy2  = k%2;
		
		
		System.out.println("isDivisbleBy10 = "+isDivisbleBy10);
		if(isDivisbleBy10==5){
			
			System.out.println("yes , it is divisible by 10");
			
		}
		
		
		System.out.println("isDivisbleBy5 = "+isDivisbleBy5);
		if(isDivisbleBy5==0){
			
			System.out.println("yes , it is divisible by 5");
			
		}
		
		System.out.println("isDivisbleBy3 = "+isDivisbleBy3);
		if(isDivisbleBy3==0){
			
			System.out.println("yes , it is divisible by 3");
			System.out.println("yes , it is divisible by 3");
			System.out.println("yes , it is divisible by 3");
			System.out.println("yes , it is divisible by 3");
			System.out.println("yes , it is divisible by 3");
			System.out.println("yes , it is divisible by 3");
			
			
		}
		
		
		System.out.println("isDivisbleBy2 = "+isDivisbleBy2);
		if(isDivisbleBy2==0){
			
			System.out.println("yes , it is divisible by 2");
			
		}
		
		
		
		/////////////////////////////////////
		
		
		int x = 567;
		
		if(x>30){
			System.out.println("greater than 30");
			
			if(x>60){
				System.out.println("greater than 60");
			}
		}
		
		if(x<30){
			System.out.println("less than 30");
		}
		
		if(x==30){
			System.out.println("equal to 30");
		}
		
		System.out.println("///////////////////////////////////////");
		
		char cc = 'A';
		
		if(cc=='B'){
			System.out.println("yes, cc is equal to 'A'");
		}else{
			System.out.println("No, cc is not equal to 'A'");
		}
		
		
		
		
		
		
	}
	
}