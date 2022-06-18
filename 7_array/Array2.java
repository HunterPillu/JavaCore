import java.util.Scanner;
public class Array2{
	
	int j =7;
	static int k =90;
	String ss1;
	
	//public Array2(){
		//default constructor
		//primary constructor
		//System.out.println("Constructor called");
		//j =9;
		
	//}
	

	
	public Array2(String ss1, int j){
		this.ss1 = ss1;
		this.j=j;
	}
	
	//no return type
	// name is as per Class name
	
	public static void main2(){
		
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Enter day count");
		int day = scanner.nextInt();
		
		if(day == 1){
			System.out.println("Monday");
		} else		if(day == 2){
			System.out.println("Tue");
		}else 
		if(day == 3){
			System.out.println("Wed");
		}else 
		if(day == 4){
			System.out.println("Thur");
		}else 
		if(day == 5){
			System.out.println("Fri");
		}else 
		if(day == 6){
			System.out.println("Sat");
		}else 
		if(day == 7){
			System.out.println("Sun");
		}else 
		if(1 >day || day > 7){
			System.out.println("Invalid day count");
		}
		
		System.out.println("----------------------------");
		
		switch(day){
			case 5 :{
				System.out.println("Fri");
				break;
			}
			case 6 : {
				System.out.println("Sat");
				break;
			}
			case 7:{
				System.out.println("Sun");
				break;
			}
			
			default:{
				System.out.println("May be Invalid day count");
			}	
		}
		
		System.out.println("----------------------------");
		
		String[] week = new String[]{"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
		
		System.out.println(week[day-1]);
		
		this.j = 9;
		//this.main2();
	}
	
	public void main3(){
		
		this.j =0;
		
		Array2 aa  = new Array2("ss",89);
		aa.j =0;
		aa.main2();
		
		//new Array2().j=0;
	}
	
	
	
	public static void main(String[] args){
		//int j=10;
		Array2 aa  = new Array2();
		Array2 aa2  = new Array2();
		Array2 aa3  = new Array2();
		
		aa.j =8;
		k =870;
		
		
		
		System.out.println(aa.k);
		System.out.println(aa2.k);
		System.out.println(aa3.k);
		
		
		if(true){
			return;
		}
		
		main2();
		
		if(true){
			return;
		}
		
		
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