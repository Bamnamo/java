package exception;

public class PasswordTest {
	private static  String userPassword;
	
	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) throws PasswordException {
		if(userPassword == null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다");
		}
		else if(userPassword.length() < 5) {
			throw new PasswordException("비밀번호는 5자 이상 입니다.");
		}
		else if(userPassword.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 숫자를 포함해야 합니다.");
		}
		this.userPassword = userPassword;
	}
	 
	public static void main(String[] args) {
		PasswordTest test = new PasswordTest();
		String userPassword = null;
		try {
			test.setUserPassword(userPassword);
			System.out.println("오류 없음1");
		}catch(PasswordException e) {
			System.out.println(e.getMessage());
		}
	userPassword = "abcd";
	try {
		test.setUserPassword(userPassword);
		System.out.println("오류없음2");
	}catch(PasswordException e) {
		System.out.println(e.getMessage());
	}
	userPassword = "abcde";
	try {
		test.setUserPassword(userPassword);
		System.out.println("오류없음3");
	}catch(PasswordException e) {
		System.out.println(e.getMessage());
	}
	}

}
