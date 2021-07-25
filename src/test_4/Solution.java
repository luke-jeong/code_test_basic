package test_4;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
        
        
        System.out.println(fruit());
        
        
 
       }
	public static String fruit() {
		
		Scanner sc = new Scanner(System.in);   
        System.out.print("숫자 입력 : ");
        
        int num = 0; 
        int sum = 0;             
        
        num = sc.nextInt();
        
		int ori = num;
		do {
			do {
	        	sum += num%10;            
	            num /= 10;	            	     
	        }while(num !=0);

				ori -= sum;
				num = ori;
				sum = 0;
				sum += num%10;            
	            num /= 10;

		}while(ori > 101);

	        System.out.println("결과 : "+ ori);

        // 위 계산식에 따르면 결과값은 언제나 apple만 출력되게 됩니다.
        // 따라서 return되는 값은 언제나 apple이 됩니다.
        return "apple";
	}
	

}

	
	
	