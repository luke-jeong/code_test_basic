package test_3;

import java.util.Scanner;

public class Solution {
	
		public static int games() {
			
				int score = 0;
				int count = 1;
				
				System.out.println("경기 결과");
				Scanner sc = new Scanner(System.in);

				do {
					int A = sc.nextInt();
					int B = sc.nextInt();
					
					if(A > B) {
						score += 3;
					}else if (A == B){
						score += 1;
					}else if(A < B){
						score += 0;
					}
					count ++;
				}while(count != 11);
			
				System.out.println("승점 :" + score);
				return score;
		}
		
		public static void main(String[] args) {
			
			System.out.println(games());
		}
}

				
	

				
			
		
		
	

