public class Tool extends Chair{
	
	
	public void getTotalLegsCount(){
		System.out.println("3");
	}
	
	
	public void getCount(){
		System.out.println(5);	
	}
	
	public void getCount(int k){
		System.out.println(k+1);	
	}

	public void getCount(int k,int j, int kk){
		System.out.println(k);
	}
	
	public void getCount(int k, int m){
		System.out.println(k+m);
	}
	
	public static void main(String[] args){
		
		Tool tt= new Tool();
		
		tt.getTotalLegsCount();
		tt.getChairColor();
		
		tt.getCount();
		tt.getCount(34);
		tt.getCount(34,16);
		
	}
	
}