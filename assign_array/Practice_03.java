package assign_array;
public class Practice_03 
{
	public static void main(String[] args) 
	{
	    String name[]=new String[3];
	    name[0]="ram";
	    name[1]="ramesh";
	    name[2]="Shri";
	    int rollno[]=new int[3];
	    rollno[0]=12;
	    rollno[1]=13;
	    rollno[2]=14;
	    double salary[]=new double[3];
	    salary[0]=50000;
	    salary[1]=100000;
	    salary[2]=250000;
	    for (int i=0; i<3; i++)
	    {
	    	System.out.println(name[i]);
	    	System.out.println(rollno[i]);
	    	System.out.println(salary[i]);
	    }
	}
}

