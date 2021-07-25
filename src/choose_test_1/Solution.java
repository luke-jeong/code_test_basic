package choose_test_1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	//알파벳의 모음을 지정하고 입력받은 String이 지정한 모음과 동일하다면
	//count를 올리는 방법으로 모음의 개수를 세었습니다.
	public static void main(String[] args) {
        
        System.out.println(alph());
    }
	
	public static int alph() {
		Scanner sc = new Scanner(System.in);
        System.out.print("단어를 입력해 주세요 : ");
        String str = sc.nextLine(); 
        sc.close();
 
        int count = 0;
        String[] word = { "a", "e", "i", "o", "u" };
 
        for (int i = 0; i < str.length(); i++) {
            String s = str.substring(i, i+1);
            if (Arrays.stream(word).anyMatch(s::equals)) count++;
        }
        
       return count;
}
	
}
