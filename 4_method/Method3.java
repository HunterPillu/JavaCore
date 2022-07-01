public class Method3 {


//syntex
    // MODIFIER OUTPUT NAME (INPUT) {
        //body
        //STatement
    // } 

 public void  calculateAgeOfAmit( int b ){
          //BODY
     }

      //method , 2 input a and b , INT
      //output int
      // substract the inputs

     public int substraction(int a , int b){
           int c= a-b;
           return c;
      }


      //member method
     int calculateAddition(int i,int j ,int k){
		 System.out.println("i ka value = "+i);
		 System.out.println("j ka value = "+j);
		 System.out.println("k ka value = "+k);
       int x=  i+j+k;
       return x;
     }
	 
	 float multiply(){
		float f =  2* 5.5f; 
		return f;
	 }
	

     public static void main(String[] args){

        //addition 3 input and then output
        Method3 mm= new Method3();
        int result= mm.calculateAddition(150,100,50);
      
        System.out.println(result);
		
		
        //multiplication 0 input then output
			float result2 = mm.multiply();
			System.out.println(result2);
        // check condition and print , 0 input , no output
		
		
		
		//flow if, if-else
			//if(CONDITION) boolean  true/false
		
		
			if(result>999){
				System.out.println("yes , its is greater tha 999");
			}
			
			if(result>1001){
				System.out.println("yes , its is greater tha 1001");
			}
			
			int b = result/2;
			if(b==500){
				System.out.println("yes , its is multiple of 500");
			}else{
				System.out.println("No , its is not a multiple of 500");
			}
			
			
			
			while(result>100){
				
				result=result-1;
				
			}
			
			int dayOfyear = 1; // initialization
			while(dayOfyear<366){ //CONDITION
				System.out.println("LOOP2 , today day is "+dayOfyear);
				if(dayOfyear==210){
					System.out.println("Happy birthday ");
				}
				dayOfyear=dayOfyear+1; //INCREAMNET/DECREAMENT
			}
			
			for(initialization; CONDITION ;INCREAMNET){
				
			}
			
			for(int dayOfyear = 1; dayOfyear<366;dayOfyear=dayOfyear+1;){
				System.out.println("LOOP2 , today day is "+dayOfyear);
				if(dayOfyear==210){
					System.out.println("Happy birthday ");
				}
			}
			
		
		
      }

}

//input /output numbers. strings , 
