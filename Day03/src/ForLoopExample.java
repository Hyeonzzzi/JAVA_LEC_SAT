/**
 * 반복문 For
 * @author tj
 *
 * for(초기화식; 조건식; 증감식) {
 *   .. 실행부
 *   }
 *   
 */
public class ForLoopExample {

	public static void main(String args[]) {
	
		//1-10까지 출력하세요
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		//-- 블라블라
		System.out.println(10);
	

		//-- 중첩된 for문
		// 구구단
		// 2단 - 9단까지
		// x * y -> x 결정
		for(int x1 = 2; x1 <= 9; x1 ++) { // x는 결정됨
			
			System.out.println("======" + x1 + "단 ======");
			for(int y1 = 1; y1 <= 9; y1++) { // y축
				System.out.println(x1 + " x " +  y1 + "=" + (x1 * y1));
						
				
				
			}
			
			
		}
	
	
	
	}
}



	
