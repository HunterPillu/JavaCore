class A {	
void m1(String x){
 System.out.println("One");	
}
protected void m1(String x, String y){
 System.out.println("Two");	
}
public static void main(String[] args){
 A a = new A();
 a.m1("ABC");
 a.m1("PQR", "XYZ");
 }
}

public   // anyone can access
protected  // same package/folder can access
private  // same class can access