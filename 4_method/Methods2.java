public class Methods2{

	static int j =9;
	int i = 99;

	static String s = "2MB";

	public static void addition(){
		int a =90;
		int b = 80;
		int c = a+b;
		System.out.println(c);
	}

	public static int addition2(int a){
		int b=78;
		int c = a+b;
		//System.out.println(c);

		// Methods2 mm =new  Methods2();
		// mm.substract();

		return c;

	}



	public static int checkMax(int a , int b){
		if(a>b){
			return a;
		}else{
			return b;
		}
		//System.out.println(c);

		

	}

	public void substract(){
		int a =90;
		int b = 80;
		int c = a-b;
		System.out.println(c);
	}


	public static int multiplication(){
		int a =10;
		int b = 5;
		int c = a*b;
		//System.out.println(c);
		//break, continue, return
		return c;
		//System.out.println(c);
	}


	public float devide(){
		float a =10f;
		float b = 3f;
		float c = a/b;

		return c;
	}

	public int[] createTable(){
		int[] table = new int[10]; // [5,10,15 .. .. 50]

		// [5,10,15]
		//int sum =0;
		for (int i = 0; i < table.length; i++) {
			table[i]= 5*(i+1);
			//sum = sum+table[i];
		}

		return table;

	}


	public static void main(String[] args){

		// int a =90;
		// int b = 80;
		// int c = a+b;
		// System.out.println(c);

		Methods2 mm =new Methods2();
		System.out.println(mm.i);
		


		addition();

		mm.substract();

		int d = multiplication();
		System.out.println(d);

		float e = mm.devide();
		System.out.println(e);


		//System.out.println(multiplication());

		int[] table= mm.createTable();
		//System.out.print(table);
		
		for (int i = 0; i < table.length; i++) {
			System.out.print(" "+table[i]);
		}

		System.out.println();
		int a =20;
		int g=addition2(a);
		System.out.println(g);
		

		//int h = addition3(35,15);
		System.out.println(checkMax(35,15));
		System.out.println(checkMax(135,15));
		System.out.println(checkMax(235,2315));
		System.out.println(checkMax(335,15));
		System.out.println(checkMax(435,15));
		System.out.println(checkMax(635,135));



		// a= 6;
		// b=5;
		// c=9;


		//  a =90;
		//  b = 80;
		//  c = a+b;
		// System.out.println(c);
		
		//addition();

		// a= 6;
		// b=5;
		// c=9;

		// 	a =90;
		// 	b = 80;
		// 	c = a+b;
		//    System.out.println(c);

		//addition();

	}

}