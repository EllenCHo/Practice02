package com.javaex.prac02;

public class Problem01 {
	public static void main(String[] args) {
		int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
		int num, sum;
		sum = 0;				//배수의 합
		num = 0;				//개수
		
		
		for(int i : data) {
			if(i%3==0) {
				num++;
				sum+=i;
			}
		}
		
		
		System.out.println("주어진 배열에서 3의 배수의 개수->"+num);
		System.out.println("주어진 배열에서 3의 배수의 합->"+sum);
	}

}
