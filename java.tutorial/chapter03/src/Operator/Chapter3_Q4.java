package Operator;

public class Chapter3_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 20;
		boolean result;
		
		result = ((num1 > 10) && (num2 >10));
		System.out.println(result);
		result = ((num1 > 10) || (num2 >10));
		System.out.println(result);
		System.out.println(!result);
	}

}
