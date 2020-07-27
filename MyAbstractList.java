package week07;
/**
 * 
 * 
 * @author Kristian Dimitrov
 * 
 *
 *
 * @param <E>
 */

public abstract class MyAbstractList <E> implements MyList<E>
{

	protected int size = 0;
	
	@Override 
	
	 /** Add a new element at the end of this list */
	public void add(E e)
	{
		
		add(size,e);
	}
	
	public boolean isEmpty() 
	{
		
		return size == 0;
	}
	
	protected MyAbstractList()   /** Create a default list */
	{
}
	protected MyAbstractList(E[] objects) 
	  /** Create a list from an array of objects */
	{
		for (int i = 0; i <objects.length; i++)
			add(objects[i]);
		
	
}
	@Override   /** Return true if this list contains no elements */
public boolean isEmpty(E e) 
{
	return size ==0;
}



@Override /** Return the number of elements in this list */
public int size() 
{
	return size;
}
}