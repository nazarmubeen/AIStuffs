package datascience;

import java.text.BreakIterator;

public class SentenceDetection {

	public static void main(String[] args)
	{
		String name="my name is nazr jdsjcjk dslkhwiehkx \n"
				+ "hrlkghelkhglk \n"
				+"fregjkerkjgfe";
		useSentenceIterator(name);
	}
	
	static void useSentenceIterator(String source){
		
	BreakIterator iterator=BreakIterator.getSentenceInstance();
	iterator.setText(source);
	int start = iterator.first();
	 
	for (int end = iterator.next(); end != BreakIterator.DONE; 
	          start = end, end = iterator.next()) { 
	          System.out.println(source.substring(start,end)); 
	        } 
	}
}
