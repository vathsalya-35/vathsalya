//Create 1 child class having main method ,1 abstarct class having 1 abstract method and 1 concrete method and interface having abstarct method and create relation between child class->Abstract class->Interface
package assign_interface;
interface MyInterface 
{
    void interfaceMethod();
}
abstract class MyAbstractClass implements MyInterface 
{
    void concreteMethod() 
    {
        System.out.println("This is a concrete method in the abstract class");
    }
    abstract void abstractMethod();
}
public class Assignment_51 extends MyAbstractClass 
{
    public void interfaceMethod() 
    {
        System.out.println("Implemented interface method in the child class");
    }
    @Override
    void abstractMethod() 
    {
        System.out.println("Implemented abstract method in the child class");
    }
    public static void main(String[] args) {
        Assignment_51 A1 = new Assignment_51();
        A1.interfaceMethod();
        A1.abstractMethod();
        A1.concreteMethod();
    }
}