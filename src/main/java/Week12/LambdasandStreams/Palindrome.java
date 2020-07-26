package Week12.LambdasandStreams;

public class Palindrome {
	public boolean isPalindrome(String inputtxt)
	{
		int start = 0;
		int end = inputtxt.length()-1;
		while(start < end)
		{
			if(inputtxt.charAt(start) != inputtxt.charAt(end))
				return false;
			start += 1;
			end -= 1;
		}
		return true;
	}
}
