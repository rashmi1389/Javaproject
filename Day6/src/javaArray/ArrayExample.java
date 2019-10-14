package javaArray;

public class ArrayExample {
public static void main(String[] args) {
	int arr [] = new int[5];
	arr[0]= 10;
	arr [1]=20;
	arr [2]=30;
	arr [3]=40;
	arr [4]=50;
	{
		System.out.println(arr.length);
	}
	for(int x = 0; x<arr.length; x++)
	{
	
		System.out.println(arr [x]);
		
	}
}
}
