package datascience;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadingJSON {

	public static void main(String[] args) throws org.json.simple.parser.ParseException
	{
	
		JSONParser parser = new JSONParser();
		try{
			File file=new File("D:\\Testings\\data science\\JSON.txt");
		    JSONObject jObj = (JSONObject) parser.parse(new FileReader(file));
		   Set<Object> sets=jObj.keySet();
		   System.out.println(sets.size());
		   execute(sets,jObj);
		
		    
		} catch (IOException e) {
		    System.err.println(e.getMessage());
		}

		
		
	}
	
	static void execute(Set<Object> sets,JSONObject jObj)
	{
		 for(Object key:sets)
		 {
			 System.out.println(key);
			 JSONObject newjson=(JSONObject) jObj.get(key);
			 System.out.println(newjson);
			 if(newjson!=null && newjson.entrySet().size()>0)
			 {
				 execute(newjson.entrySet(),newjson);
			 }
			 
		 }
	}
}
