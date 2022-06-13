public class Array2{
	
	
	public static void main(String[] args){
		
		int[] rollNumbers;
		
		rollNumbers= new int[10]; //[0,0,0,0,0,0,0,0,0,0]
		
		int x = rollNumbers[0];
		int y = rollNumbers[5];
		int z = rollNumbers[6];
		
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		rollNumbers[6]=89;
		rollNumbers[0]= 90;
		
		System.out.println(rollNumbers[6]);
		System.out.println(rollNumbers[0]);
		
		System.out.println("------------------------------------");
		
		
		for(int i =0; i<rollNumbers.length;i++){
			rollNumbers[i]=5*(i+1);
		}
		
		
		
		
		
		
		for(int i =0; i<rollNumbers.length;i++){
			System.out.println(rollNumbers[i]);
	
		}
		
		
		
		int[] ages = new int[10];
		
		
		System.out.println("------------------------------------");
		
		//int[] num = new int[]{11,4,6,87,9,5,99,6};
		int[] num = new int[]{1,1,1,1,2,1,1,1};
		
		int max=num[0];
		int min=num[0];
		
		for(int i = 1; i<num.length; i++){
			
			if(max < num[i]){
				max=num[i];
			}
			
			
			if(min>num[i]){
				min=num[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);
		
		
		System.out.println("------------------------------------");
		
		float total=0f;
		for(int i = 0; i<num.length; i++){
			
			total = total+num[i];
		}
		
		System.out.println(total);
		
		//int avg = total/(num.length);
		float avg2 = total/(num.length);
		
		//System.out.println(avg);
		System.out.println(avg2);
		
	}
	
}