package Chapter05;

public class FunctionTest {
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		System.out.println(num1 + "+" + num2 + "=" + sum + "입니다");
		
		int result = substract(num1, num2);
		System.out.println(num1 + "-" + num2 + "=" + result + "입니다");
		
		int result1 = times(num1, num2);
		System.out.println(num1 + "*" + num2 + "=" + result1 + "입니다");
		
		int result2 = divide(num1, num2);
		System.out.println(num1 + "/" + num2 + "=" + result2 + "입니다");
		
		
		
		
		
				
	}

	public static int divide(int n1, int n2) {
		int result = n1 / n2;
		return result;
	}

	public static int times(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}

	public static int substract(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}

	public static int add(int n1, int n2) {		
		int result = n1 + n2;
		return result;
	}
}
