package super_class;
public class This_keyword 
{
     int age;
     String name;
     double salary;
     void student_details(int age,String name) 
     {
    	 this.age=age;
    	 this.name=name;
    	 this.salary=salary;
    	 System.out.println("student details as follows");
     }
	public static void main(String[] args) 
	{
		This_keyword T1=new This_keyword ();
		T1.student_details(23, "Ram");
		System.out.println(T1.age);
		System.out.println(T1.name);
		System.out.println(T1.salary);

	}

}
