package test_1;

import java.util.Scanner;

public class Solution {
	// 3개월씩 월을 입력하면 각 분기로 출력되게 설계했습니다.
	public static void main(String[] args) {
		
		
		System.out.println(num());
		    
        
	}
	
	public static String num() {
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력해주세요 : ");
		
		int i = sc.nextInt();
		 if(0<i&&i<4) {
			 return "1";
		 } else if(3<i&&i<7) {
			 return "2";
		 } else if(6<i&&i<10) {
			 return "3";
		 } else if(9<i&&i<13) {
			 return "4";
		 }
		 return null;
	}
	
}
