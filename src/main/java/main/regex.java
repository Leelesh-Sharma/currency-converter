package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
	
	public double numbers(String data) {

	    String regex2 = "[0-9]+(.[0-9]*)?";

	    Pattern pattern = Pattern.compile(regex2);
	    Matcher matcher = pattern.matcher(data);
	    
	    double d = 0.0;
	    
	    while(matcher.find()) {
	       d = Double.parseDouble(matcher.group());
	    }
	    
	    return d;
	}
	
	public void hello() {
		System.out.println("Hi");
	}
}
