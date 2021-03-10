package study_API.string;

public class Application1 {

	public static void main(String[] args) {

		// String 클래스의 자주 사용하는 메소드1
		/*목차
		 * 1. charAt()
		 * 2. compareTo() / 
		 * 3. compareToIgnoreCase()
		 * 4. concat()
		 * 5. indexOf()
		 * 6. lastIndexOf()
		 * 7. trim()
		 * 8. toLowerCase()
		 * 9. toUpperCase()
		 * 10. substring()
		 * 11. replace()
		 * 12.length()
		 * 13.isEmpty
		 * */
		
		/*	1. charAt() :  해당 문자열의 특정 인덱스에 해당하는 문자 반환
		 * 				   (0부터 시작, 인덱스 벗어나면 IndexOutofBoundsException 발생) 
		 * */
			

		String str = "hello";
		//			  01234	
		System.out.println(str.charAt(0)); 
		
		// for 문으로 인덱스 순서대로 해당문자를 출력해보자
		for(int i = 0; i < str.length(); i++) {
			System.out.println("str(" + i + ") : " + str.charAt(i));
		}
		
		/*	2. compareTo() :  인자로 전달된 문자열과 사전 순으로 비교를 하여 
		 * 					  문자열이 같다면 0을 반환 / 인자로 전달된 문자열보다 작으면 음수를 / 크면 양수를 반환한다.
		 *					  대소문자를 구분하여 비교. 
		 * */
		
		String str2 = "java";
		String str3 = "java";
		String str4 = "JAVA";
		String str5 = "oracle";
		
		// 2-1 같으면 0을 반환
		System.out.println("compareTo() : " + str2.compareTo(str3));
		
		// 2-2 대소문자 비교(대소문자는 32만큼 차이가 난다.)
		System.out.println("compareTo() : " + str2.compareTo(str4));	// 인자로 전달된 문자열보다 크다
		System.out.println("compareTo() : " + str4.compareTo(str2));	// 인자로 전달된 문자열보다 작다
		
		// 2-3 j에서 o까지 5만큼 차이가 난다.
		System.out.println("compareTo() : " + str3.compareTo(str5));	// 인자로 전달된 문자열보다 작다
		System.out.println("compareTo() : " + str5.compareTo(str3));	// 인자로 전달된 문자열보다 크다
		
		/*	3. compareToIgnoreCase() : 대소문자를 구분하지 않고 비교 후 int 값 반환*/
		System.out.println("compareToIgnoreCase() : " + (str3.compareToIgnoreCase(str4)));
		
		/*	4. concat() : 문자열에 인자로 전달된 문자열을 합친 후 새로운 문자열을 반환한다.
		 * 			      원본문자열에는 영향을 주지 않는다.
		 * */
		System.out.println("concat() : " + (str4.concat(str5)));
		System.out.println("원본 str4 확인 : " + str4);
		
		/*	5. indexOf() : 문자열에서 특정 문자를 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 반환한다.(일치하는 것 만나면 멈춤)
		 * 				   단, 일치하는 문자가 없는 경우 1을 반환한다. */
		String indexOf = "apple";
		System.out.println("indexOf('p') : " + indexOf.indexOf('p'));
		System.out.println("indexOf('b') : " + indexOf.indexOf('b'));
		
		/*	6. lastIndexOf() : 문자열 탐색을 뒤에서부터 하고 처음 일치하는 위치의 인덱스를 반환한다.(일치하는 것 만나면 멈춘다.)
		 * 					   단, 일치하는 문자가 없는 경우 -1을 반환한다.
		 * */
		System.out.println("lastIndexOf : " + indexOf.lastIndexOf('l'));
		
		/*	7. trim() : 문자열의 앞 뒤에 공백을 제거한 문자열을 반환한다. 중간 공백은 제거되지 않는다 
		 * */
		String trimStr = "   apple   ";
		System.out.println("trimStr : #" + trimStr + "#");
		System.out.println("trimStr : " + trimStr.trim());
		
		/*	8. toLowerCase() : 모든 문자를 소문자로 변환*/
		String caseStr = "ApplE";
		System.out.println("toLoweCase() : " + caseStr.toLowerCase());
		
		/*	9. toUpperCase() : 모든 문자를 대문자로 변환*/
		System.out.println("toLoweCase() : " + caseStr.toUpperCase());
		
		/*	10. substring() : 문자열의 일부를 잘라내어 새로운 문자열을 반환.(원본 영향없음)
		 * */
		String javaoracle = "javaoracle";
		
		System.out.println("substring(3,6) : " + javaoracle.substring(3,6));
		System.out.println("substring(3) : " + javaoracle.substring(3));
		
		/*	11. replace() : 문자열에서 대체할 문자열로 기존 문자열을 변경해서 반환한다.*/
		System.out.println("replace() : " + javaoracle.replace("java", "python"));
				
		/*	12. length() : 문자열의 길이를 정수형으로 반환한다.*/
		System.out.println("length() : " + javaoracle.length());
		System.out.println("빈 문자열의 길이 : " + "".length());		//null과 다르다!
		
		/*	13. isEmpty() : 문자열의 길이가 0이면 true를 반환, 아니면 false를 반환*/
		System.out.println("isEmpty() : " + "".isEmpty());
		System.out.println("isEmpty() : " + "abc".isEmpty());
		
	}
}
