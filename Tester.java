import java.util.*;
public class Tester {
	public static void main(String...args){
	

	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter no of integers u want to put in array..");
	int noOfInteger = sc.nextInt();
	
		MyArray m = new MyArray();
		 //System.out.println(Arrays.toString(m.readIntegers(noOfInteger)));
		 int z= m.findMin(m.readIntegers(noOfInteger));
		 System.out.println("MIN IS........ "+z);
		 sc.close();
		
	}

}

