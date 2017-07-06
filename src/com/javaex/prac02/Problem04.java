package com.javaex.prac02;

import java.util.Scanner;


//이것이 자바다 책에서 나온 향상된 for문을 이용
public class Problem04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액 : ");
		int money = sc.nextInt();
		
		int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		
		
		for(int i : unit) {
			System.out.println(i+"원 : "+ money/i+"개");
			
			money = money % i;				//나눈 나머지값 다시 저장 
													//그 단위 후의 단위로 다시 계산할 수 있음
		}
		
		sc.close();
		
	}

}
