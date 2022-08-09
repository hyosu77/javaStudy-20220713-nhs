package j01_출력;

public class MyInfo {

	public static void main(String[] args) {
		
		char name1 = '김'; //한글자만 넣는다 ''사용
		char name2 = '준';
		char name3 = '일';
		int age = 29;
		String name = "김준일"; // string은 문자열을 넣는다 "" 사용
		
		String address = "부산 동래구 사직동";
		
		
		System.out.print("이름: ");
		System.out.println(name);
		System.out.print("나이: ");
		System.out.println(age);
		System.out.print("주소: ");
		System.out.println(address);
		System.out.println();

	}

}
