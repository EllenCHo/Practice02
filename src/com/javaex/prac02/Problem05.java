package com.javaex.prac02;

public class Problem05 {

	public static void main(String[] args) {
		int[] numbers = new int[6];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random()*45)+1;
			
			for(int j = 0; j<i; j++) {
				if(numbers[j] == numbers[i] ) {
					numbers[i] = (int)(Math.random()*45)+1;
					
					j = 0;
				}
				
			}
			
			System.out.print(numbers[i]+"\t");
			
		}
		
	}

}
