package week02;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * This class will store the number of integers passed in via 
 * the constructor in a linked list @see java.util.LinkedList 
 * and time how long it takes to go through the list using 
 * an iterator and get(index)
 * 
 * @author Kristian Dimitrov
 *
 */
public class IteratorTest
{
	/**
	 * Constructor
	 * An instance of the StopWatch class should be instantiated here
	 * The size of the list to be created should be persisted in a class
	 * attribute.
	 * 
	 * @param listSize size of the test to execute;
	 */
	public IteratorTest(int listSize)
	{
		m_listSize = listSize;
		m_watch = new StopWatch();
		initialize();
	}
	
	/**
	 * Executes the iterator/get timing test
	 * This method should use the StopWatch class created 
	 * in the constructor to capture start/stop/elapsed time for each run.
	 * 
	 * Pseudocode:
	 * Get iterator from linked list.
	 */
	public void execute()
	{
		Iterator<Integer> iter = m_linkedList.listIterator();
		m_watch.start();
		while(iter.hasNext())
		{
			Integer integer = iter.next();
		}
		m_watch.stop();
		m_iteratorElapsedTime = m_watch.getElapsedTimeMilliSeconds();
		
		m_watch.start();
		for(int index = 0; index < m_linkedList.size(); index++)
		{
			Integer integer = m_linkedList.get(index);
		}
		m_watch.stop();
		m_getAtElapsedTime = m_watch.getElapsedTimeMilliSeconds();
		
	}
	
	/**
	 * Getter method that returns the iterator elapsed time
	 * 
	 * @return Elapsed time to walk the list using the iterator
	 */
	public long getIteratorElapsedTimeInMilliseconds()
	{
		return m_iteratorElapsedTime;
	}

	/**
	 * Getter method that returns the get(index) elapsed time.
	 * 
	 * @return Elapsed time to walk the list using the get(index) method
	 */
	public long getElapsedTimeInMilliseconds()
	{
		return m_getAtElapsedTime;
	}
	
	/**
	 * The size of the linked list after the integers have been added.
	 * @return The size of the linked list
	 */
	public long getListSize()
	{
		return m_linkedList.size();
	}
	
	/**
	 * Helper method used in reference implementation to
	 * initialize the linked list with the requested number of integers
	 */
	private void initialize()
	{
		m_linkedList = new LinkedList<Integer>();
		for(int data = 0; data < m_listSize; data++)
		{
			m_linkedList.add(data);
		}
	}
	
	private int m_listSize;
	private StopWatch m_watch;
	private LinkedList<Integer> m_linkedList;
	private long m_iteratorElapsedTime;
	private long m_getAtElapsedTime;
}
