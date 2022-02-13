import java.util.*;
public class MyArray {
public int[] readIntegers(int count){
	int [] myIntegers = new int[count];
	Scanner s = new Scanner(System.in);
	int index = 0;
	
	int counter=1;
	while(index < count)
	{
		System.out.println("Enter Number.....>"+counter);
		myIntegers[index]=s.nextInt();
		
		index++;
		counter++;
	}
	return myIntegers;
	
}
public int findMin(int[] something){
	int min = Integer.MAX_VALUE;
	for(int i = 0; i < something.length;i++){
		int value=something[i];
		if(value<min){
			min=value;
		}	
	}
	return min;
	}  
 }





