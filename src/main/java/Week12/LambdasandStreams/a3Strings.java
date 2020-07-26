package Week12.LambdasandStreams;
import java.util.stream.Stream; 
public class a3Strings {

	public static void main(String[] args) {
		Stream<String> StringList = Stream.of("Me","and","my","friends","are","very","close"); 
        StringList.filter(str -> str.startsWith("a") && str.length()==3)
        .forEach(System.out::println); 
	}

}
