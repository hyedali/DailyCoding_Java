package org.opentutorials.javatutorials.numberstring;

public class CharString {

	// 문자와 문자열 
	public static void main(String[] args) {
	
		System.out.println('생');
		System.out.println("생활코딩");
		
		// System.out.println('생활코딩');
		// 자바의 경우 String의 경우 "", Char의 경우 '' : 문자와 문자열을 구분하는 특수한 기호
		
		// 이렇게 작성하더라도 문자열임 -> 자바에서 문자와 문자열 처리를 구분하기 위해...
		System.out.println("생");
		
		System.out.println("생활코딩"+"입니다.");
		
		// 다음을 주의하여야 
		System.out.println(1+1);
		// 결과 => 2
		System.out.println("1"+"1");
		// 결과 => 11
		
		// 3. 이스케이프 
		//System.out.println("enging said "Welcom progamming world".");
		System.out.println("enging said \"Welcom progamming world\".");
		
		System.out.println("enging said\n \"Welcom progamming world\".");

		
	}

}
