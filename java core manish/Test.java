class Test()
{
void Show()
{
System.out.println("1");
}

}  
class Xyz extends Test
{
void Show()
{
System.out.println("2");
}
public static void main(String[] args)
{
Test t=new Test();
t.Show();
Xyz x=new Xyz();
x.Show();

}
}