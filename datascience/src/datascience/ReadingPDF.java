package datascience;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

public class ReadingPDF {

	public static void main(String[ ] args)
	{
		try {
			convertPdf("C:/Users/mnmubeen.ORADEV/Desktop/pdf-test.pdf");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TikaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	 static void convertPdf(String fileName) throws IOException, SAXException, TikaException
	 {
		 
		 InputStream stream = null;
		 try {
			stream = new FileInputStream(fileName);
			AutoDetectParser parser = new AutoDetectParser(); 
			 BodyContentHandler handler = new BodyContentHandler(-1);
			 Metadata metadata = new Metadata(); 
			 parser.parse(stream, handler, metadata, new ParseContext()); 
			 System.out.println(handler.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally { 
            if (stream != null) 
                try { 
                     stream.close(); 
                } catch (IOException e) { 
                  System.out.println("Error closing stream"); 
                } 
         } 
		 
	 }
}
