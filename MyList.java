package week07;
/**
 * 
 * @author Kristian Dimitrov
 *
 */

public interface MyList<E> extends java.lang.Iterable<E> /** @param <E> */
{

public void add(E e);  /** Add a new element at the end of this list */

public void add(int index, E e); /** Add a new element at the specified index in this list */

public void clear(); /** Clear the list */

public boolean contains(E e);   /** Return true if this list contains the element */

public E get(int index); /** Return the element from this list at the specified index */

public int indexOf(E e);   /** Return the index of the first matching element in this list.
 *  Return -1 if no match. */

public boolean isEmpty(E e); 
/** Return true if this list contains no elements */

public int lastIndexOf(E e);   /** Return the index of the last matching element in this list
 *  Return -1 if no match. */

public E remove(int index); /** Remove the first occurrence of the element o from this list.
 *  Shift any subsequent elements to the left.
 *  Return true if the element is removed. */

public E set(int index, E e); /** Replace the element at the specified position in this list
 *  with the specified element and returns the new set. */

public int size(); 
/** Return the number of elements in this list */


	
	
	
}
