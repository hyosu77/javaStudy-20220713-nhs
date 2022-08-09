package j02_변수와상수;

public class Constant {

	public static void main(String[] args) {
	     final int MAX_NUMBER = 100;  //상수는 대문자로 표기 하고 _ 사용 final 상수 바꿀수없다
	     final int MIN_NUMBER = 0;
	     
	     MAX_NUMBER = 200;
	     
	     
	     
	     int number = 10;
	     number = 80;
	     
	     System.out.println("최소값: "+ MIN_NUMBER);
	     System.out.println("최대값: "+ MAX_NUMBER);
	     System.out.println("현재값: "+ number);

	}

}
