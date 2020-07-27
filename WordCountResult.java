package week04;
/** 
 * @author Kristian Dimitrov
 * 
 */

public class WordCountResult 
{
	
	private int m_count;
	private String m_word;
	public WordCountResult(int count , String word)
	{
		super();
		this.m_count = count;
		this.m_word = word;
	}
	
	public int getCount()
	{
		
		return m_count;
	}
	public String getWord()
	{
		
		
		return m_word;
	}
	

	public void incrementCount()
	{
		++ m_count;
		
	}
	
	public void setCount(int count)
	{
		this.m_count = count;
	}
	public void setWord(String word)
	{
		
	this.m_word = word;
		
	}
	
	@Override
	
	public String toString() 
	{
		return getCount() + "\the" + getWord();
	}
	
}