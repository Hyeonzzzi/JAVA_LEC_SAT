/**
 * Switch 문
 * @author tj
 *
 *switch(변수/값) {
 *	case 값 :
 *	 ... 실행문
 *	 break;
 * default :
 *   ... 실행문
 */
public class Condition2Example {

	public static void main(String[] args) {
		
		int a = 10;
		a = 7;
		switch(a) {
		  case 5:
			  System.out.println("5입니다.");
			  break;
		  case 10:
			  System.out.println("10입니다.");
			  break;
		  default:
			  System.out.println("맞는 숫자가 없습니다.");
			  
		}
		
		String name = "하악";
		switch(name) {
		case "허억" :
			System.out.println("허억!!");
			break;
		
			
		}
	}
}

	
