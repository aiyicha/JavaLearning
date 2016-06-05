package ntt.bai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	public static void main(String[] args) {
		
//		Pattern p = Pattern.compile("\\w+");
//		Matcher m = p.matcher("Everything is possible.");
//		while(m.find()){
//			System.out.println(m.group()+"\t");
//		}
//		int position = 0;
//		while(m.find(position)){
//			System.out.println(m.group()+"\t");
//			position++;
//		}
		
		String ss = "Here is a test for Regex";
		StringBuffer sbuf = new StringBuffer();
		Pattern pnew = Pattern.compile("[aeiou]");
		Matcher mnew = pnew.matcher(ss);
		String tt = mnew.replaceAll("a");
		System.out.println(tt);
		while(mnew.find()){
			mnew.appendReplacement(sbuf, mnew.group().toUpperCase());
			
			System.out.println(mnew.group());
		}
			
		System.out.println(sbuf.toString());
		
	}

}
