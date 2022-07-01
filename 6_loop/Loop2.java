public class Loop2{
	
	
	
	public static void main(String[] args){
		
		
		
		
		int y = 100;
		
		//continue;
		//if(1==1){
		//	return;
		//}
		//break;
		
		for(int x = 1; x<=11; x=x+2){
			
			y= y+1;	
			//5,6,7,8,9,10
			//1,3,5,7,9,11
			//y++;

		System.out.println(x);			
		}
		
		System.out.println("==============================");
		System.out.println(y); //105,104
		// next codes
		
		y=100;
		for(int x = 11; x>=1; x=x-2){
			
			y= y+1;	
			//5,6,7,8,9,10
			//10,8,6,4,2
			//11,9,7,5,3,1,
			//y++;

		System.out.println(x);			
		}
		
		System.out.println("==============================");
		System.out.println(y);
		System.out.println("==============================");
		
		
		int tableOf = 4;
		for(int i = 1; i<=10; i++){
			
			if(i==5 &&  i ==6  || i==7){
				
				//continue; //skip 
				//return;
				break; //loop // switch
			}
			
				int result  =  tableOf * i;
				//1-2 = 12
				//"1" + "2" =  "12"
				//boolean f  = false;
				//"my" + " world "  + f + i=  "my world false"
				//"my" + " world "  - f 
				
				//System.out.print("4 X "  + i   + " = "  + result ); // String concatination/ addition / append
				
				
				System.out.print("4 X "); 
				System.out.print(i);
				System.out.print(" = ");
				System.out.print(result);
				System.out.println();
			
		
		}
		
		
		
		
		for(int row = 1 ; row<=5 ; row++){
				
				//System.out.println(row);
				
				//row = 1,2,3,4
				
				
				for(int col =1 ; col<=5;col++){
					
					//col = 1
					//1,2,3,<=4
					
					if(col<=row){
						System.out.print("*");
					}
					
				}
				
			System.out.println(	);
			
		}
		
		
	}
	
	//return  
	
	//x++;
	//x= x+1;
	
	
}