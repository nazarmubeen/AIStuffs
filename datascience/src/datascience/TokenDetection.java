package datascience;

import java.text.BreakIterator;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.xwpf.usermodel.BreakType;

public class TokenDetection {

	public static void main(String[] args)
	{
		
		String name="my naem , \" , djgkjd  is nazar ";
	//	useTokenizer(name);
	//	useBreakIterator(name);
		useRegEx(name);
	}
	
	static void useTokenizer(String input)
	{
		
		StringTokenizer tokenizer=new StringTokenizer(input);
		String word=" ";
		while(tokenizer.hasMoreTokens())
		{
			word=tokenizer.nextToken();
			System.out.println(word);
		}
	}
	
	static void useBreakIterator(String input)
	{
		BreakIterator tokenizer=BreakIterator.getWordInstance();
		tokenizer.setText(input);
		int start=tokenizer.first();
		
		for (int end = tokenizer.next(); 
	             end != BreakIterator.DONE; 
	             start = end, end = tokenizer.next()) { 
	             System.out.println(input.substring(start,end)); 
	        } 
	}
	
	static void useRegEx(String input){ 
	      System.out.println("Regular Expression"); 
	      Pattern pattern = Pattern.compile("\\w[\\w-]+('\\w*)?"); 
	      Matcher matcher = pattern.matcher(input); 
	 
	      while ( matcher.find() ) { 
	          System.out.println(input.substring(matcher.start(), 
	            matcher.end())); 
	      } 
	   } 
}
