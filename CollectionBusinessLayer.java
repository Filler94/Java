package week03;

import java.util.ArrayList;
import java.util.List;

/**
 * Implements the business logic
 * 
 * @author scottl
 *
 */
public class CollectionBusinessLayer
{
	/**
	 * Default constructor.
	 * Creates an empty list for the DataLayer
	 */
	public CollectionBusinessLayer()
	{
		this(new ArrayList<Employee>()); // init with an empty list
	}
	
	/**
	 * Parameterized constructor.
	 * Accepts a list of employees and creates a DataLayer instance.
	 * 
	 * @param list List of employees to initialize the system with
	 */
	public CollectionBusinessLayer(List<Employee> list)
	{
		m_data = new DataLayer(list);
	}

	/**
	 * Displays all the employees using their display name.
	 * Access the data layer to get the current list
	 * 
	 * @return List of employees
	 */
	public List<Employee> listAllEmployees()
	{
		List<Employee> employeeList = m_data.getEmployees();
		return employeeList;
	}

	/**
	 * Retrieve a single Employee by last name
	 * 
	 * @param lastName Last name of employee to lookup
	 * @return Employee if found otherwise null
	 */
	public Employee listEmployee(String lastName)
	{
		Employee e = m_data.getEmployeeByName(lastName);
		return e;
	}

	/**
	 * Deletes an employee
	 * 
	 * @param lastName Last name of employee to lookup
	 * @return Deleted employee or null if employee not found
	 */
	public Employee deleteEmployee(String lastName)
	{
		Employee employee = m_data.getEmployeeByName(lastName);
		if(employee != null)
		{
			m_data.deleteEmployee(employee);
		}

		return employee;
	}

	/**
	 * Change an employee salary This changes the in memory image.
	 * 
	 * @param lastName
	 *            The last name to look up
	 * @param newSalary
	 *            The new salary value
	 * @return true if salary was changed, otherwise false
	 * @throws CollectionsAppDataException
	 */
	public boolean changeEmployeeSalary(String lastName, double newSalary)
	{
		boolean success = true;
		Employee employee = m_data.getEmployeeByName(lastName);
		if(employee != null)
		{
			employee.setSalary(newSalary);
		}
		else
		{
			success = false;
		}
		
		return success;
	}

	/**
	 * Add a new employee and persists it
	 * 
	 * @param first
	 *            First name
	 * @param last
	 *            Last name
	 * @param salary
	 *            Salary
	 * @return The new employee instance
	 */
	public Employee addEmployee(String first, String last, double salary)
	{
		Employee newEmp = new Employee(first, last, salary);
		m_data.addEmployee(newEmp);

		return newEmp;
	}

	private DataLayer m_data;
}
