package Week12.LambdasandStreams;
import java.util.*;
public class PalindromeMain {

	public static void main(String[] args) {
		 List<String> StringList=new ArrayList<String>();  
	        StringList.add("Devarshaa");
	        StringList.add("rotator");
	        StringList.add("dream");
	        StringList.add("level");
	        StringList.add("mom");
	        //System.out.println(StringList.size());
	     Palindrome p = new Palindrome();
	        for(int i=0;i<StringList.size();i++)
	        {
	        	String str = StringList.get(i);
	        	if(p.isPalindrome(str))
	        		System.out.println(str);
	        }
	}

}
