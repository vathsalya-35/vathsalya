package assign_array;
import java.util.Arrays;
public class Assignment_64 
{
	public static void main(String[] args) 
	{
		String name []=new String[3];
	       name[0]="Ram";
	       name[1]="Ravi";
	       name[2]="Sita";
	       System.out.println(Arrays.toString(name));
	       Arrays.sort(name);  
	       System.out.println(Arrays.toString(name));
	       int rollno[]=new int[3];
	       rollno[0]=12;
	       rollno[1]=52;
	       rollno[2]=43;
	       Arrays.sort(rollno);
	       System.out.println(Arrays.toString(rollno));	       
	}
}
