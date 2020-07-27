package week04;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 
 * @author Kristian Dimitrov
 *
 */

public class CountUtility
{
	
	public List<WordCountResult> countWordOccurrences(BufferedReader reader) throws IOException
	{
		Map<String, WordCountResult> map = new HashMap<String, WordCountResult>();
		String line = null;
		while ((line = reader.readLine()) !=null)
		{
			if( !line.isEmpty())
			{
				evaluateLine(line,map);
				
			}
			
		
		}
		return new ArrayList<WordCountResult>(map.values());
	}
	
		private void evaluateLine(String line, Map<String, WordCountResult> map)
		{
			
			
			
			line = line.replaceAll("\\.", "");
			line = line.replaceAll(",", "");
			
			
			
			String[] words = line.split(" ");
			

			
			for(int i = 0; i < words.length; i++)
			{
				if(!map.containsKey(words[i])) 
				{
				
			
				map.put(words[i], new WordCountResult(1, words[i]));
				
				
				
				}
				
				
				else 
				{
					
					map.get(words[i]).incrementCount();
				}	
				}					
}			
}