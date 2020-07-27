import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class Student
{


String DegreeProgram;
String GradYear;
String GPA;


public Student() 
{


DegreeProgram = "";
GradYear = "";
GPA = "";

}


public Student(String _DegreeProgram, String _GradYear, String _GPA)
{



	
	DegreeProgram = _DegreeProgram; 
	GradYear = _GradYear; 
	GPA = _GPA; 
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
			
			
			pw.print("DegreeProgram: " + DegreeProgram + "\r\n" );
			pw.print("GradYear: " + GradYear + "\r\n" );
			pw.print("GPA: " + GPA + "\r\n" );

			pw.close();
			
}


	catch (IOException e)
{
	System.out.println("Something is wrong");
}

 }
 
} 
