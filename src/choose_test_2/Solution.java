package choose_test_2;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		//값을 입력받은 뒤 순서대로 정렬한 array의 인덱스를 입력받은 개수의 반 만큼 지정해 중간 값을 찾았습니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i<N; i+=1) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println(arr[N/2]);
		
	}

}
