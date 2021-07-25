package test_2;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		//숫자 중복을 해결하지는 못했습니다. 입력받은 수를 순서대로 정렬하고
		//제일 마지막 수를 기준으로 모든 수 가 다 있다고 가정할때 총합을 구한 뒤
		//사용자가 입력한 수의 합을 빼서 빠진 수를 구하는 방법을 선택했습니다.
		

		System.out.println("빠진 수 : " + missing_num());
	}
		
	public static int missing_num() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 숫자의 개수 : ");	    		
		int N = sc.nextInt();
		
		System.out.print("숫자 입력 : ");
		int[] arr = new int[N];
	    		
		int sum = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}	        
		sc.close();
				
		Arrays.sort(arr);
		
		int last_num = arr[N-1];
		int origin_sum = (last_num*(last_num+1))/2;
		
		int missing_num = origin_sum - sum;

		if(missing_num > 0) {
			return missing_num;
		}else if(missing_num == 0){			
			return last_num+1;
		} 
		return 0;
		}	
	}


