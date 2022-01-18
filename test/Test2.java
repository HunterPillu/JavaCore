// Create a java program to convert the input stirng =aabbccddeeffaaaall into output string=a2b2c2d2e2f2a4l2


public class Test2{
	
	static String inputStr = "aabbccddeeffaaaall"; 
	static String outputStr = ""; 
	static char[] inputCharArr;
	
	
	
	public static void main(String[] args){
		
		System.out.println("Given input is "+inputStr);
		inputCharArr = inputStr.toCharArray();
		
		
		char currentChar='_';
		int currentCharCount=0;
		for(int i=0;i<inputCharArr.length;i++){
			
			if(inputCharArr[i]!=currentChar){
				
				if(currentCharCount>0){
					outputStr+=currentChar+""+currentCharCount;
				}
				
				currentChar=inputCharArr[i];
				currentCharCount=0;
			}
			
			currentCharCount++;
			
			
			if(i==inputCharArr.length-1){
				outputStr+=currentChar+""+currentCharCount;
			}
						
		}
		
		
		System.out.println("Output is  "+outputStr);
		
		
	}

}