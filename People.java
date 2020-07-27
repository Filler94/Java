import java.text.*;
import java.util.*;

//Chapter 9 Project
//Kristian Dimitrov

public class People

{

	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String date;
	
	public People(String first, String last, String address, String city, String state, String zip) 
	{
		setFirstName(first);
		setLastName(last);
		setAddress(address);
		setCity(city);
		setState(state);
		setZip(zip);
		setToCurrentDate();
	}
	
	private void setFirstName(String name) 
	{
		firstName = name;
	}
	
	private void setLastName(String name) 
	{
		lastName = name;
	}
	
	private void setAddress(String givenAddress) 
	{
		address = givenAddress;
	}

	private void setCity(String city2) 
	{
		city = city2;
	}
	
	private void setState(String state2) 
	{
		state = state2;
	}
	
	private void setZip(String zip2) 
	{
		zip = zip2;
	}
	
	private void setToCurrentDate()
	{
		Date currentDate = new Date();
		date = currentDate.toString();
	}
	
	public String toString()
	{
		return "Name of individual: " + firstName + " " + lastName + "\n" + "Address: " + address + "\n" + "city: " + city + "\n" + "state: " + state + "\n" + "zip: " + zip + "\n" + "date: " + date;
	}
	
}
