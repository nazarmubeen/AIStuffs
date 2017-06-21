package datascience;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;

public class Test2 {

	public static void main(String[] args)
	{
		
			String file="D:/Projects/exclusion_list/Test_procedure.txt";
			try (Stream<String> stream = Files.lines(Paths.get(file))) 
			{ 
		        stream.forEach(System.out::println); 
		    } 
			catch (IOException e) { 
		        System.out.println("Error reading " +  file.length()); 
		      } 
			method2();
	}
	
	static void method2()
	{
		File file = new File("D:/Projects/exclusion_list/Test_procedure.txt"); 
		try {
			String text = FileUtils.readFileToString(file, "UTF-8");
			System.out.println(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
