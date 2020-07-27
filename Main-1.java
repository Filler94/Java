import java.io.*; 
import java.util.*;

public class Main 
{

	public static void main(String[] args)
	{
		

		int choice = 0;
		Scanner sc = new Scanner(System.in);
		String response = "y";
	    ArrayList<Person> p = new ArrayList();
		while (response.equals("y"))
		{
			
			
		System.out.println("Type 1 to create a person,  2 to create a Student, 3 to end");
		choice = sc.nextInt();
		sc.nextLine();
			
			
			if(choice == 1){
				
				
				System.out.println("Enter the firstname:");
				String firstname = sc.nextLine();
				
				System.out.println("Enter the lastname:");
				String lastname = sc.nextLine();
				
				System.out.println("Enter the ID:");
				String ID = sc.nextLine();
				
				
				
				Person person1 = new Person(firstname, lastname,ID);
				
				
			}
			if(choice == 2)
			{
				
				
				
				System.out.println("Enter the DegreeProgram:");
				String DegreeProgram = sc.nextLine();
				
				System.out.println("Enter the GradYear:");
				String GradYear= sc.nextLine();
				
				System.out.println("Enter the GPA:");
				String GPA = sc.nextLine();
				
				
				Student student1 = new Student(DegreeProgram, GradYear, GPA);
					
			}
			if(choice == 3 )
			{
				response= "n";
			}
			
		}
		

		
   }
	
	public static void display()
	{
		
		try
		{
		
			File Tesla = new File("Tesla.txt");
			Scanner out = new Scanner(Tesla);
			while (out.hasNext())
		
			{
				System.out.println(out.nextLine());
				
					
			}		
			
			out.close();
	
        }
		catch (IOException e)
		{
			System.out.println("Something is wrong");
		}
		
     }

}
		

