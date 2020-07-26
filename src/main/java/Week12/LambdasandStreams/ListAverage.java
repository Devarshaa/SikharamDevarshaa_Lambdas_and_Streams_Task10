package Week12.LambdasandStreams;
import java.util.*; 
import java.util.stream.IntStream; 
public class ListAverage {
	public static void main(String[] args) 
    { 
        IntStream list_inputs = IntStream.of(10,20,30,40,50,60,70,80,90);  
        OptionalDouble average = list_inputs.average(); 
        if (average.isPresent()) { 
            System.out.println("Average : "+average.getAsDouble()); 
        } 
        else { 
            System.out.println("-1"); 
        } 
    }
}