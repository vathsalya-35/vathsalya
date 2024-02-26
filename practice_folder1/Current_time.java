package practice_folder1;
import java.util.Date;
public class Current_time 
{
	public static void main(String[] args) 
	{
	   Date d1=new Date();
	   System.out.println(d1.getTime());
	   Date d2=new Date(d1.getTime());
	   System.out.println(d2);
	   String mydate=d2.toString();
	   System.out.println(mydate);
	   String year=mydate.substring(24);
	   System.out.println(year);
	   String month=mydate.substring(8, 10);
	   System.out.println(month);
	   String day=mydate.substring(0, 3);
	   System.out.println(day);
	   System.out.println(mydate.concat(month).concat(year));
	   System.out.println(mydate.concat("/").concat(month).concat("/").concat(year));
	}
}
