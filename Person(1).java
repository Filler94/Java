// Kristian Dimitrov
// 04.13/2017
// Chapter 14



public class Person
{
String firstname;
String lastname;
String ID;

public Person(String FirstName, String LastName , String id)
{
	this.firstname = FirstName;
	this.lastname = LastName;
	this.ID = id;
	
}

public String getfirstname()
{
	return firstname;
	
}
public void setfirstname(String FirstName)
{
	firstname = FirstName;
	
}
public String getlastname()
{
	return lastname;
	
}
public void setlastname(String LastName)
{
	lastname = LastName;
}
public String getID()
{
	return ID;
	
}
public void setID(String id)
{
	ID = id;
}

public void printID ()
{
	System.out.println("The ID is :" + ID + " ");
}

public void printPerson ()
{
	System.out.println("The person is :" + firstname + " " + lastname + " " + ID);
	
}
}

