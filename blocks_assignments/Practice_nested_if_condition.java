package blocks_assignments;

public class Practice_nested_if_condition {

	public static void main(String[] args) {
      int salary =10000;
      char gender = 'M';
      if (salary>=5000)
      {
    	  if (gender=='M')
    	  {
    		  System.out.println("logic1");
    	  }
    	  else 
    	  {
    		  System.out.println("logic2");
    	  }
      }
      else 
      {
    	  System.out.println("logic3");
      }
      System.out.println("logic4");
	}

}
