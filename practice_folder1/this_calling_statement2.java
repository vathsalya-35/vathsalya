package practice_folder1;
public class this_calling_statement2 
{
    this_calling_statement2(int a)
    {
        this(6, 8.0);
        System.out.println("statement1");
    }
    this_calling_statement2(int a, double b)
    {   
        this('b');
        double sum = a + b;
        System.out.println("statement2");
    }
    this_calling_statement2(String name)
    { 
        this(8);
        System.out.println("statement3");
    }
    this_calling_statement2(char a)
    {   
        
        System.out.println("Statement4");
    }
    // Default constructor added
    public this_calling_statement2() 
    {
        this(1); // Provide default values or leave it empty
    }

    public static void main(String[] args) 
    {
        new this_calling_statement2();
    }
}
