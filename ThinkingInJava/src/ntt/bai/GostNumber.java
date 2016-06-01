package ntt.bai;

import java.util.ArrayList;
import java.util.List;

public class GostNumber {

	public static void main(String[] args){
		int a,b,c,d;
		List<String> list = new ArrayList<String>();
		System.out.println("Gost Numbers are: ");
		for (int loopNum = 1000; loopNum < 10000; loopNum++) {
			a = loopNum / 1000;
			b = (loopNum - a * 1000) / 100;
			c = (loopNum - a * 1000 - b * 100) / 10;
			d = loopNum - a * 1000 - b * 100 - c * 10;
			if (c == 0 && d == 0){
				continue;
			}
			if ((10 * a + b)*(10 * c + d) == loopNum){
				System.out.println(loopNum + " : " + (10 * a + b) + " * " + (10 * c + d));
			} else if ((10 * a + b)*(10 * d + c) == loopNum){
				System.out.println(loopNum + " : " + (10 * a + b) + " * " + (10 * d + c));
			} else if ((10 * b + a)*(10 * d + c) == loopNum){
				System.out.println(loopNum + " : " + (10 * b + a) + " * " + (10 * d + c));
			} else if ((10 * b + a)*(10 * c + d) == loopNum){
				System.out.println(loopNum + " : " + (10 * b + a) + " * " + (10 * c + d));
			} else if ((10 * a + c)*(10 * b + d) == loopNum){
				System.out.println(loopNum + " : " + (10 * a + c) + " * " + (10 * b + d));
			} else if ((10 * a + c)*(10 * d + b) == loopNum){
				System.out.println(loopNum + " : " + (10 * a + c) + " * " + (10 * d + b));
			} else if ((10 * c + a)*(10 * b + d) == loopNum){
				System.out.println(loopNum + " : " + (10 * c + a) + " * " + (10 * b + d));
			} else if ((10 * c + a)*(10 * d + b) == loopNum){
				System.out.println(loopNum + " : " + (10 * c + a) + " * " + (10 * d + b));
			} else if ((10 * a + d)*(10 * b + c) == loopNum){
				System.out.println(loopNum + " : " + (10 * a + d) + " * " + (10 * b + c));
			} else if ((10 * a + d)*(10 * c + b) == loopNum){
				System.out.println(loopNum + " : " + (10 * a + d) + " * " + (10 * c + b));
			} else if ((10 * d + a)*(10 * b + c) == loopNum){
				System.out.println(loopNum + " : " + (10 * d + a) + " * " + (10 * b + c));
			} else if ((10 * d + a)*(10 * c + b) == loopNum){
				System.out.println(loopNum + " : " + (10 * d + a) + " * " + (10 * c + b));
			} else {
				continue;
			}
		}
	}
}
