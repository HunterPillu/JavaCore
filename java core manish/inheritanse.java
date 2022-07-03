abstract class Vehicle
{
abstract void Start();

}
class Car extends Vehicle
{
void Start()
{
System.out.println("car start with key");
}
}
class Scoter extends Vehicle
{
void Start()
{
System.out.println("scoter starts with kick ");

}
public static void main(String[] args)
{
Car c=new Car();
c.Start();
Scoter s=new Scoter();
s.Start();

}
}