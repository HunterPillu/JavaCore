public class Str{
	
	public static void main(String[] args){
		
		int i = 7; // mutable
		
		
		i = 8;
		
		String s = "test"; // immutable
		
		System.out.println(s);
		
		s = "Hello";
		
		System.out.println(s);
		
		
		//char[] s = new char[]{'H','e','l','l','o'};
		//char[] s1 = new char[]{'t','e','s','t'};
		
		
		s = s+"ee";
		
		String s1 =  new String("newlyCreated");
		
		
		StringBuffer sf = new StringBuffer("hello");
		sf.append("ee");
		sf.append("ff");
		
		
		
		System.out.println(sf);
		
		
		//System.out.println(sf.reverse());
		
		sf.deleteCharAt(3);
		System.out.println(sf);
		
		System.out.println(sf.indexOf("ll"));
		
		
		
		
		// ternary operator
		
		normal operator
		
		operand  operator  operand
		23 + 34 
		
		
		operannd  operator operand operator operand
		 Boolean   ?         23      :        34
		 
		 
		 int x  =  (i==7) ? 23 : 34;
		 
		 int x;
		 if(i==7){
			 
			 x = 23;
			 
		 }else{
			 
			 x=34;
			 
		 }
		 
		 
		  int x  =  (i==7) ? (i!=8 ? 23:56) : 34;
		  
		
	}
	
}