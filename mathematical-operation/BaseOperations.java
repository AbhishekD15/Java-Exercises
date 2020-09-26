import java.util.Scanner;


public class BaseOperations {
	
	
	Scanner input=new Scanner(System.in);
	
	//for integer array
	
	
	//for printing array and the reverse array
	void printArray(int [] array) {
		System.out.println("Array : ");
		System.out.print("[ ");
		for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
           }
		System.out.println("]");
		
		
		System.out.println("Reverse array : ");
		array = reverseArray(array);
		System.out.print("[ ");
		for(int i=0;i<array.length;i++){
             System.out.print(array[i]+" ");
           }
		System.out.println("]");
	 }
	
	//defining integer reverseArray method
	int [] reverseArray(int [] array) {
		 for(int i=0;i<array.length/2;i++) {
			 int temp=array[i];
			 array[i] =array[array.length-i-1];
			 array[array.length-i-1]=temp;
			 
		 }
			 return array;
		 }
	//for float array
	
	
	//for printing array and the reverse array
	void printArray(float [] array) {
	
		System.out.println("Array : ");
		System.out.print("[ ");
		for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
           }
		System.out.println("]");
		
		System.out.println("Reverse array : ");
		array = reverseArray(array);
		System.out.print("[ ");
		for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
           }
		System.out.println("]");
		}
	
	//defining float reverseArray method
	float [] reverseArray(float [] array) {
		 for(int i=0;i<array.length/2;i++) {
			 float temp=array[i];
			 array[i] =array[array.length-i-1];
			 array[array.length-i-1]=temp;
			 
		 }
			 return array;
		 }
	
	//for printing array and the reverse array
	void printArray(String [] array) {
		System.out.println("Array : ");
		System.out.print("[ ");
		for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
           }
		System.out.println("]");
		
		System.out.println("Reverse array : ");
		array = reverseArray(array);
		System.out.print("[ ");
		for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
           }
		System.out.println("]");
		}
	
	
	//defining string reverseArray method
	String [] reverseArray(String [] array) {
		 for(int i=0;i<array.length/2;i++) {
			 String temp=array[i];
			 array[i] =array[array.length-i-1];
			 array[array.length-i-1]=temp;
			 
		 }
			 return array;
		 }
	
	
	public  void intgerArrayInput(int length) {
		int array[]=new int[length];

        System.out.println("enter integer elements");

        for(int i=0;i<length;i++){//for reading integer array
            array[i]=input.nextInt();
           }
        printArray(array);
	}
	
	
	public  void floatArrayInput(int length) {
		float array[]=new float[length];

        System.out.println("enter float  elements");

        for(int i=0;i<length;i++){//for reading float array
            array[i]=input.nextFloat();
        }
        printArray(array);
	}
	
	public  void stringArrayInput(int length) {
		String array[]=new String[length];

        System.out.println("enter string elements");

        for(int i=0;i<length;i++){//for reading stringarray
            array[i]=input.next();
           }
        printArray(array);
	}
	
	
	public static void main(String[] args) {
		
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=num.nextInt();
		//creating object of BaseOperation class
		BaseOperations ob = new BaseOperations();
		
		//calling methods
		ob.intgerArrayInput(n);
		ob.floatArrayInput(n);
		ob.stringArrayInput(n);
		

        num.close();
        
       
	}
}


