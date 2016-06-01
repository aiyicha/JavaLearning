package ntt.bai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("\\w+");
		Matcher m = p.matcher("Everything is possible.");
		while(m.find()){
			System.out.println(m.group()+"\t");
		}
		int position = 0;
		while(m.find(position)){
			System.out.println(m.group()+"\t");
			position++;
		}
	}

}
