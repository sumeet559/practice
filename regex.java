import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex{
	private static String REGEX = "((//.*?$)|(/\\*.*?\\*/)|(/\\*\\*.*?\\*/))";
	private static String INPUT = "";
	
	public static void main(String[] args)
	throws IOException{
		FileReader f1 = new FileReader("AskMe.txt");
		BufferedReader br = new BufferedReader(f1);
		String s = "";
		String temp = "";
		//Matcher m;
		//Pattern expression;
		while ((temp = br.readLine()) != null) {
			s += temp;
			s += '\n';
		}
		String com = "";
		INPUT = s;
		Pattern p = Pattern.compile(REGEX, Pattern.MULTILINE | Pattern.DOTALL);
		Matcher m = p.matcher(INPUT);
		while(m.find()){
			com += m.group();
			com += "\n";
		}
		System.out.println(com);
		//System.out.println(s);
	}
}
