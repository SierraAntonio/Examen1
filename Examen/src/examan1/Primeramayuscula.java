package examan1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Primeramayuscula
{
	
	  public static void main(String[] args) {
	      String str = "anita lava la tina de noche";
	      System.out.println(str);
	      StringBuffer strbf = new StringBuffer();
	      Matcher match = Pattern.compile("([a-z])([a-z]*)", Pattern.CASE_INSENSITIVE).matcher(str);
	      while(match.find()) 
	      {
	         match.appendReplacement(strbf, match.group(1).toUpperCase() + match.group(2).toLowerCase());
	      }
	      System.out.println(match.appendTail(strbf).toString());
	  }
	}