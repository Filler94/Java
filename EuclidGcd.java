package week05;



/**
* @author Kristian Dimitrov
* 
* 
* 
* 
* 
*/
public class EuclidGcd
{
	/**
	 * Default constructor
	*/
	
	public EuclidGcd()
	{
		
		
	}
		
	   /**
     * @param The EuclidGCD algorithm
     */
		
		
	
	public long getEuclidGcdBreak(long m, long n)
	{
 
		
		if (m % n == 0)
			return n;
		else
			return getEuclidGcdBreak(n, m % n);
		
		
	}
	   /**
     *@param This method returns the EuclidGCD algorithm
     */
	
	public long start(long m, long n)
	{
	

	return getEuclidGcdBreak(m,n);
}}
