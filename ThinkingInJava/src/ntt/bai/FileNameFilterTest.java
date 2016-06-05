package ntt.bai;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileNameFilterTest implements FilenameFilter{

	
	Pattern p = null;
	public FileNameFilterTest(String regex){
		p = Pattern.compile(regex);
	}
	public boolean accept(File file, String str){
		
		Matcher m = p.matcher(str);
		return m.matches();
	}
	
	public static void main(String[] args) {
		
		File file = new File("J:\\JavaFile");
		FileNameFilterTest fileFilter = new FileNameFilterTest(".*\\.txt");
		File[] fileList = file.listFiles(new FilenameFilter(){
			private Pattern pattern = Pattern.compile(".*\\.txt");
			public boolean accept(File file, String name){
				return pattern.matcher(name).matches();
			}
		});
		for (File ff: fileList){
			System.out.println(ff.getName());
		}
		
	}

}
