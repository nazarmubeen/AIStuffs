package datascience;

import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;

public class GettingHierarchyOfFiles {

	public static void main(String[ ] args)
	{
		System.out.println(listFiles(new File("D:/Projects")).size());
		listFilesusingApache("D:/Projects");
	}
	
	
	 public static Set<File> listFiles(File rootDir) { 
		 
		 Set<File> fileSet =new HashSet<>();
		 if(rootDir==null || rootDir.listFiles()==null)
		 {
			 return fileSet ;
		 }
		 
		for(File f:rootDir.listFiles())
		{
			
			if(f.isFile())
			{
				fileSet.add(f);
			}
			else{
				fileSet.addAll(listFiles(f));
			}
			
		}
		 
		 
		 return fileSet ;
		 
	 }
	 
	 public static void listFilesusingApache(String rootDir){ 
		 
		 File dir=new File(rootDir);
		 List<File> files=(List<File>) FileUtils.listFiles(dir, TrueFileFilter.INSTANCE, TrueFileFilter.INSTANCE);
		 for (File file : files) { 
	           System.out.println("file: " + file.getAbsolutePath()); 
	        } 
	 }
	 
}
	 

