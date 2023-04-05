package java_test;

public class Account {
	String account_num;
	String name;
	int money;
	
	void Account(String account_num, String name, int money) {
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
