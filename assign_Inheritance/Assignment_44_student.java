//WAP for single level inheritance where gk method(child) is static and parent(selenium and java) are non static.
package assign_Inheritance;
public class Assignment_44_student extends Assignment_44_Teacher 
{
     static void gk() 
     {
    	 System.out.println("General Knowledge");
     }
     public static void main(String[]orgs) 
     {
    	 gk();
    	 Assignment_44_student A1=new Assignment_44_student();
    	 A1.selenium();
    	 A1.java(); 
     }    
}
