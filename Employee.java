package week03;

import java.text.DecimalFormat;

/**
* @author Kristian Dimitrov
* 
*/
public class Employee {
	
	
	
	private DecimalFormat  m_decimalFormatter;
	private String m_firstName;
	private String m_lastName;
	private double m_salary;
	private static final String MONEY_PATTERN = "###,##0.00";
	
;
	
	public Employee()
	{
		this("New First", "New Last", 0.00);
	}
	
	public Employee(String first, String last)
	{
		this(first, last, 0.00);
	}

	public Employee(String first, String last, double salary)
	{
		setFirstName(first);
		setLastName(last);
		setSalary(salary);
	}

	public String getFirstName() 
	{
		return m_firstName;
	}

	public void setFirstName(String firstName) 
	{
		m_firstName = firstName;
	}

	public String getLastName() 
	{
		return m_lastName;
	}

	public String getFormattedSalary()
	{
		
	
	m_decimalFormatter = new DecimalFormat(MONEY_PATTERN);

			return m_decimalFormatter.format(m_salary);
	
	}
	
	public  String getDisplayName()
	{
	
		return getLastName() + ", " + getFirstName();
		
		

	}
	
	public void setLastName(String lastName) 
	{
		m_lastName = lastName;
	}

	public double getSalary() {
		return m_salary;
	}

	public void setSalary(double Salary) 
	{
		m_salary = Salary;
	}

	@Override
	public String toString() 
	{
		return getDisplayName() + " Salary: $" + getFormattedSalary();
		
	}

	@Override
	public boolean equals(Object emp) {
		if (this == emp)
			return true;
		if (emp == null)
			return false;
		if (getClass() != emp.getClass())
			return false;
		Employee other = (Employee) emp;
		if (m_lastName == null) {
			if (other.m_lastName != null)
				return false;
		} else if (!m_lastName.equals(other.m_lastName))
			return false;
		return true;
	}
	
}
