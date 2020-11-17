package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		
		String[] strings = new String[5];
		
		strings[0] = "jaffy";
		strings[1] = "ilikanna";
		strings[2] = "meridoli";
		strings[3] = "oleoyd";
		strings[4] = "kejrek";
		
		
		System.out.println(strings[2]);
		
		strings[2] = "lala";
		
		System.out.println(strings[2]);
		
		for(int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		
		for(int i = 0; i < strings.length; i++) {
			strings[i] = "dkleeoe" + (i + 1);
		}
		for(int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		
		int x[] = new int[50];
		
		Random r = new Random();
		
		for(int i = 0; i < x.length; i++) {
			x[i] = r.nextInt(101)-50;
		}
		
		int least = 13;
		
		for(int i = 0; i < x.length; i++) {
			if(i==0) {
				least = x[i];
			}else if (x[i]<least) {
				least = x[i];
			}
		}
		
		System.out.println(least);
		System.out.println("");
		
		for(int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		
		System.out.println("");
		
		int greatest = 13;
		
		for(int i = 0; i < x.length; i++) {
			if(i==0) {
				greatest = x[i];
			}else if (x[i]>greatest) {
				greatest = x[i];
			}
		}
		
		System.out.println(greatest);
		System.out.println("");
		
		for(int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		
		System.out.println("");
		System.out.println(x[49]);
		System.out.println(x[x.length-1]);
		
		
		//1. make an array of 5 Strings

		//2. print the third element in the array

		//3. set the third element to a different value

		//4. print the third element again
		
		//5. use a for loop to set all the elements in the array to a string of your choice
		
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		//7. make an array of 50 integers

		//8. use a for loop to make every value of the integer array a random number

		//9. without printing the entire array, print only the smallest number on the array

		//10 print the entire array to see if step 8 was correct

		//11. print the largest number in the array.
		
		//12. print only the last element in the array
		
	}
}
