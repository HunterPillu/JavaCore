import java.util.Scanner;

public class Anagram {


  public static void main(String[] args) {
    
	String a = "anagram";
	String b =  "amaagnr";
	
	char[] cA =  a.toCharArray();
	char[] cB =  b.toCharArray();
	
	int[] MM = new int[26];
	
	for(int i = 0;i<cA.length;i++){
		
		
		int value =  cA[i];
		
		System.out.print((value-97) + " , ");
		
		MM[value-97]++;
		
		
	}
	System.out.println();
	
	for(int i = 0;i<MM.length;i++){
		System.out.print(MM[i] + " , ");
	}
	
	System.out.println();
	
	for(int i = 0;i<cB.length;i++){
		System.out.print(cB[i] + " , ");
		
		int value =  cB[i];
		MM[value-97]--;
	}
	
	System.out.println();
	boolean isAnagram = true;
	for(int i = 0;i<MM.length;i++){
		System.out.print(MM[i] + " , ");
		
		
		if(MM[i]!=0){
			isAnagram =false;
			
			break;
		}
	}
	
	System.out.println();
	if(isAnagram){
		System.out.println(a + " and "+b + " is anagram");
	}else{
		System.out.println(a + " and "+b + " is not an anagram");
	}
	
        
    }
}