package datascience;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class ReadingTextFile {

	public static void main(String[] args)
	{
		//readFromFile();
		readFromURL();
		
		
	}
	
	
	static void readFromURL()
	{
		URL url=null;
		BufferedReader br=null;
		try{
			url=new URL("https://tools.ietf.org/rfc/rfc8142.txt");
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getUserInfo());
			System.out.println(url.getAuthority());
		//	url.openStream();
			URLConnection uc=url.openConnection();
			uc.connect();
/*			System.out.println("connection opening");
			System.out.println(uc.getLastModified());*/
			InputStreamReader stream=new InputStreamReader(uc.getInputStream());
			System.out.println("streaming ...");
			br=new BufferedReader(stream);
			String line=" ";
			while((line=br.readLine())!=null)
			{
				
				System.out.println(line);
			}
		}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		finally{
			System.out.println("connection closed");
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
	
	static void readFromFile()
	{
		try{
			File file=new File("D:\\Testings\\data science\\test.txt");
			FileReader reader=new FileReader(file);
			BufferedReader br=new BufferedReader(reader);
			String line=" ";
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
			}
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
	}
}
