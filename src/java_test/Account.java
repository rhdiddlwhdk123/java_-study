package java_test;

public class Account {
	String account_num;
	String name;
	int money;
	
	/*void -> public 변경
	 * void는 반환 타입을 나타내는 예약어로 반환값이 없을때 사용
	 * 생성자는 반환값이 없는 객체여서 사용할 필요가 없다.
	 * 또한 외부에서 호출할 수 있도록 public을 사용*/
	public Account(String account_num, String name, int money) {
		this.account_num = account_num;
		this.name = name;
		this.money = money;
	}
	/* BankAplication에서 Account를 호출해야함
	 * Account 생성자를 초기화
	 */
	
	
	void plus(int money, int plus) {
		int balance = money+plus;
		System.out.println("예금이 완료되었습니다. 잔액: " + balance);
		return;
		
	}//입금
	
	void minus(int money, int minus) {
		if(minus<money) {
			int balance = money-minus;
			System.out.println("출금이 완료되었습니다. 잔액: " + balance);
			return;
		}
		
		if (minus>money) {
			System.out.println("잔액이 부족합니다");
			return ;
		}
	} //출금
	
	
	
}
