package com.javaex.prac02;

import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[5];
		int sum = 0;
		
		for(int i =0; i<5; i++) {
			nums[i] = sc.nextInt();
			
			sum += nums[i];
		}
		
		double average = sum/5; 
		
		System.out.println("평균은 "+average+" 입니다.");
		
		sc.close();
	}

}
