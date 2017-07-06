package com.javaex.prac02;

import java.util.Scanner;

public class Problem04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액 : ");
		int money = sc.nextInt();
		
		int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		
		
		for(int i = 0; i<unit.length; i++) {
			System.out.println(unit[i]+"원 : "+ money/unit[i]+"개");
			
			money = money % unit[i];				//나눈 나머지값 다시 저장 
													//그 단위 후의 단위로 다시 계산할 수 있음
		}
	}

}
