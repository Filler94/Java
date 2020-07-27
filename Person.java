import java.util.*;

public class Person
{
	private String first;
	private String last;
	private String country;
	private double winPct;

	public Person(String firstName, String lastName, String place, double pct)
	{
		first = firstName;
		last = lastName;
		country = place;
		winPct = pct;
	}

	public String getFirst()
	{
		return first;
	}
	public String getLast()
	{
		return last;
	}	

	public String getCountry()
	{
		return country;
	}

	public double getWinPct()
	{
		return winPct;
	}

	public void setFirst(String toName)
	{
		first = toName;
	}
	public void setLast(String toName)
	{
		last = toName;
	}
	public void setCountry(String toCountry)
	{
		country = toCountry;
	}
	public void setWinPct(double toSet)
	{
		winPct = toSet;
	}

	public static void main(String [] args)
	{
		int numPeople = Integer.parseInt(args[0]);

		ArrayList<Person> records = new ArrayList<>();

	}
}

