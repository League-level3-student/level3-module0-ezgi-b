package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		MoreArrayFun f = new MoreArrayFun();
		String[] yey = {"Aaron", "Benni", "Cathy", "Danielle", "Ezran", "Fiona", "Gerard", "Hergils", "Ignacio", "Javier", "Karl", "Leon", "Maria", "Nadia", "Ontari", "Pia", "Quinn"};
		System.out.println("Normal Order:");
		System.out.println("");
		f.printStrings(yey);
		System.out.println("");
		System.out.println("Reverse Order:");
		System.out.println("");
		f.printStringsReverse(yey);
		System.out.println("");
		System.out.println("Every Other String:");
		System.out.println("");
		f.printEveryOtherStrings(yey);
		System.out.println("");
		System.out.println("Random Order:");
		System.out.println("");
		f.printStringsRandom(yey);
		
	}
	
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	void printStrings(String[] arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	
	void printStringsReverse(String[] arr) {
		for(int i = arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
	}
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	void printEveryOtherStrings(String[] arr) {
		for(int i = 0; i<arr.length; i++) {
			if(i%2==1) {
				System.out.println(arr[i]);
			}
		}
	}
	
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	
	void printStringsRandom(String[] arr) {
		Random r = new Random();
		int[] rand = new int[arr.length];
		for(int i = 0; i<rand.length; i++) {
			rand[i] = i;
		}
		for(int i = 0; i<rand.length; i++) {
			int a;
			int b;
			int x = r.nextInt(rand.length);
			int y = r.nextInt(rand.length);
			a = rand[x];
			b = rand[y];
			rand[y] = a;
			rand[x] = b;
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[rand[i]]);
		}
	}
}
