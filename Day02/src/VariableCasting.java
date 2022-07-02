/*
 * Type Casting (형변환)
 */

public class VariableCasting {

	
	//-- Java Application Starting Point (Entry Point)
	public static void main(String[] args) {
		
		//-- 묵시적 형변환
		byte a = 127;
		short b = a; // short(2) > byte(1)
		
		long c = 1000;
		float d = c; // 실수형은 정수형보다 무조건 큼.
		
		
		System.out.println("long to float : " + d);
		
		//-- 명시적 형변환 큰데에서 작은데로 갈때
		short aa = 127;
		byte bb = (byte)aa;
		
		System.out.println("short to byte(명시적) : " + bb);
		
		aa = 128;
		bb = (byte)aa;

		String tel = "010-2222-3333" ;
		String tel2 = "01022223333";
		
		double aaa =3.541562;
		int bbb = (int)aaa;
		System.out.println("double to float:" + bbb);
			
		
		
	}
	
}
