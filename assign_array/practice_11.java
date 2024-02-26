package assign_array;

import java.util.Arrays;

public class practice_11 {

	public static void main(String[] args) {
		String name[]=new String[5];
		int rollno[]=new int[5];
		double salary[]=new double[5];
		name[0]="Ram";
		rollno[0]=12;
		salary[0]=65000;
		name[1]="Sita";
		rollno[1]=13;
		salary[1]=75000;
		name[2]="Lakman";
		rollno[2]=14;
		salary[2]=60000;
		Arrays.sort(rollno);
		System.out.println(Arrays.toString(rollno));
		//for (int i=0;i<3;i++)
		{
			//System.out.println(name[i]);
			//System.out.println(rollno[i]);
			//System.out.println(salary[i]);
		//System.out.println(name[i]+rollno[i]+salary[i]);
	       
		}
	}

}
