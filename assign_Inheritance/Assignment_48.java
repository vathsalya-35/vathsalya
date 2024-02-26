//create a class and create two concrete methods inside a class(static add, non static sub), create abstract class and create two abstract mthods (multiplication, divison), create two concrete methods inside main method 
package assign_Inheritance;
class ConcreteClass {
    // Static method
    static void add() {
        int a = 5;
        int b = 6;
        int sum = a + b;
        System.out.println(sum);}
    // Non-static method
    void subtract() {
        int a = 10;
        int b = 4;
        int sub = a - b;
        System.out.println(sub);}
}
abstract class Assignment_48_abstract {
    abstract void multiplication();
    abstract void division();
}
public class Assignment_48 extends ConcreteClass {
    void multiplication() {
        int a = 6;
        int b = 8;
        int mult = a * b;
        System.out.println(mult);}
    void division() {
        int a = 60;
        int b = 10;
        int div = a / b;
        System.out.println(div);}
     public static void main(String[] args) {
        ConcreteClass.add();
        ConcreteClass c1 = new ConcreteClass();
        c1.subtract();
        Assignment_48 assignmentObj = new Assignment_48();
        assignmentObj.multiplication();
        assignmentObj.division();}
}