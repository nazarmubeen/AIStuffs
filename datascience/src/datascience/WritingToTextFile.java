package datascience;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class WritingToTextFile {

	public static void main(String[] args)
	{
		
		File file=new File("D:"
				+ "\\Testings"
				+ "\\data science\\table2.txt");
		writingInTextFile(file);
		File jfile=new File("D:"
				+ "\\Testings"
				+ "\\data science\\json23.txt");
		writingJSONDataInTextFile(jfile);
	}
	
	static void writingJSONDataInTextFile(File file) 
	{
		FileWriter writer=null;
		BufferedWriter bw=null;
		JSONParser parser = new JSONParser();
		try{
			File getfile=new File("D:\\Testings\\data science\\JSONnext.txt");
		    JSONObject datalist =(JSONObject) parser.parse(new FileReader(getfile));
		    System.out.println("writing to json");
		  
			writer=new FileWriter(file);
			bw=new BufferedWriter(writer);
		    writingJsonData(datalist, file,bw);    
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			if(bw!=null)
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println("file written successfully");
		}
	}
	
	static void writingJsonData(JSONObject datalist,File file,BufferedWriter bw) throws IOException
	{
			
		for(Object data:datalist.keySet())
		{
					bw.write(data.toString());
					bw.write("\t");
					
				//	bw.write(datalist.get(data).getClass().toString());
				//	bw.newLine();
					Object indata=datalist.get(data);
					if (indata instanceof org.json.simple.JSONArray) {
						System.out.println(" true ");
						JSONArray newdata = (JSONArray) indata;
						writingJsonData(newdata,file, bw);
					}
					else if (indata instanceof org.json.simple.JSONObject) {
						System.out.println(" true ");
						JSONObject newdata = (JSONObject) indata;
						writingJsonData(newdata,file, bw);
					}
					else{
					System.out.println(" false ");
					bw.write(datalist.get(data).toString());
					}
					
					bw.write(",");
					bw.newLine();
		}	


	}
	
	static void writingJsonData(JSONArray datalist,File file,BufferedWriter bw) throws IOException
	{
		System.out.println("writing in json");
		
		for(Object i:datalist)
		{
			if (i instanceof org.json.simple.JSONArray) {
				System.out.println(" true ");
				JSONArray newdata = (JSONArray) i;
				writingJsonData(newdata,file, bw);
			}
			else if (i instanceof org.json.simple.JSONObject) {
				System.out.println(" true ");
				JSONObject newdata = (JSONObject) i;
				writingJsonData(newdata,file, bw);
			}
			else{
			System.out.println(" false ");
			bw.write(i.toString());
			}
				
		}	


	}
	
	static void writingInTextFile(File file) 
	{
		BufferedWriter bw=null;
		try{
		FileWriter writer=new FileWriter(file);
		bw=new BufferedWriter(writer);
		int i=1;
		while(i!=10)
		{
			bw.write(" 2 "+" * "+i+" = "+ (2*i) + "\n");
			i++;
		}
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally{
			try {
				bw.flush();
				System.out.println("successfully data inserted");
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
