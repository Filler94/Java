package week03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * This class implements the storage interface. 
 * The assignment is using the Map class to provide the in memory storage. 
 * 
 * @author Kristian Dimitrov
 *
 */
public class DataLayer
{
	/**
	 * Constructor
	 * This accepts a list of employees to setup the starting 
	 * set of data. In a production system, this might come from a database.
	 * 
	 * @param employeeList The list of employees to initialize the
	 * data layer with
	 */
	public DataLayer(List<Employee> employeeList)
	{
		m_map = new HashMap<String, Employee>();
		initialize(employeeList);
	}

	/**
	 * Adds an employee Employees are indexed by their last name. Note:
	 * Obviously this is not robust as there could be multiple employees with
	 * the same last name, but we are doing a reference implementation here
	 * 
	 * @param employee
	 *            The employee reference to add
	 * @throws CollectionsAppDataException
	 */
	public void addEmployee(Employee employee)
	{
		m_map.put(employee.getLastName(), employee);
	}

	/**
	 * Retrieves an employee from the data store by last name
	 * 
	 * @param lastName
	 *            Name to lookup
	 * @return the Employee reference if found, otherwise null
	 */
	public Employee getEmployeeByName(String lastName)
	{
		Employee emp = null;

		if(m_map.containsKey(lastName))
		{
			emp = m_map.get(lastName);
		}

		return emp;
	}

	/**
	 * Removes an employee.
	 * 
	 * @param employee
	 *            The employee reference to remove
	 * @return true if successfully removed, otherwise false
	 * @throws CollectionsAppDataException
	 */
	public boolean deleteEmployee(Employee employee)
	{
		boolean result = false;
		if(m_map.containsKey(employee.getLastName()))
		{
			Employee emp = m_map.remove(employee.getLastName());
			result = emp == null ? false : true;
		}

		return result;
	}

	/**
	 * Copies the values from the map to a List collection and returns the list
	 * 
	 * @return List collection of Employees
	 */
	public List<Employee> getEmployees()
	{
		List<Employee> list = new ArrayList<Employee>();
		for(Employee e : m_map.values())
		{
			list.add(e);
		}

		return list;
	}

	/**
	 * Returns the number of employees in the data store
	 * 
	 * @return
	 */
	public int getSize()
	{
		return m_map.size();
	}

	/**
	 * attempt to load the data file if available.
	 */
	private void initialize(List<Employee> employeeList)
	{
		for(Employee emp : employeeList)
		{
			m_map.put(emp.getLastName(), emp);
		}

	}

	/** The collection map for our employees */
	private HashMap<String, Employee> m_map;
}
