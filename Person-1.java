import java.io.*;
public class Person
{


String firstname;
String lastname;
String ID;


public Person() 
{


firstname = "";
lastname = "";
ID = "";

}


public Person(String _firstname, String _lastname, String _id)
{



	
	firstname = _firstname; 
	lastname = _lastname; 
	ID = _id; 
	SavePersonToFile();
	
}
 
public void SavePersonToFile() 
 {


	try

	{
	
		File Tesla = new File("Tesla.txt");
			if (!Tesla.exists())
			{
				Tesla.createNewFile();
			}

			FileWriter fw = new FileWriter(Tesla, true);
			PrintWriter pw = new PrintWriter(fw);
			
			
			pw.print("firstname: " + firstname + "\r\n" );
			pw.print("lastname: " + lastname + "\r\n" );
			pw.print("ID: " + ID+ "\r\n"  );

			pw.close();
			
}


	catch (IOException e)
{
	System.out.println("Something is wrong");
}

 }
 
} 
