package java_test;

import java.util.Scanner;

public class BankApplication {
	static Account[] Ac_length = new Account[100];
	static Scanner scanner = new Scanner(System.in);
	//키보드 입력받음
	
	public static void main(String[] args) {
		
		boolean run = true; //boolean 참 또는 거짓 값만 가짐
		while(run) {
			System.out.println("1. 계좌생성 / 2. 계좌목록 / 3. 예금 / 4.출금 / 5.종료");
			System.out.println("선택>");
			
			int choice = scanner.nextInt();
			switch(choice) {
				case 1:
					creat();
					break;
				
				case 2:
					menu();
					break;
					
				case 3:
					plus();
					break;
					
				case 4:
					minus();
					break;
					
				case 5:
					run = false;
					break;
				
				default:
					System.out.println("잘못된 값입니다");
					break;
			}
		}
		
		System.out.println("시스템을 종료합니다.");
		
	}
	
	//계좌생성
	static void creat() {
		System.out.println(">> 계좌생성 <<");
		System.out.println("\n");
		
		System.out.println("계좌번호:");
		String account_num = scanner.next();
		
		System.out.println("이름:");
		String name = scanner.next();
		
		System.out.println("초기 입금액:");
		int money = scanner.nextInt();
		
		Account Ac = new Account(account_num, name, money); 
		
		//Ac.length.length는 배열의 인스턴스 변수중 하로 배열의 크기를 나타내는 정수형 값이다.
		for(int i=0; i<Ac_length.length; i++) {
			if(Ac_length[i] == null) {
				Ac_length[i] = Ac;
				System.out.println("계좌 생성이 완료되었습니다.");
				break;
			}
		}
	}
	
	//계좌목록
	static void menu() {
		System.out.println(">> 계좌목록 <<");
		System.out.println("\n");
		
		for(int i=0; i<Ac_length.length; i++) {
			Account Ac = Ac_length[i];
			System.out.println("계좌번호: " + Ac.account_num);
			System.out.println("\n");
			System.out.println("이름: " + Ac.name);
			System.out.println("\n");
			System.out.println("금액: " + Ac.money);
		}
		
	}
	
	//예금
	static void plus() {
		
		System.out.println(">> 예금 << ");
		System.out.println("\n");
		
		System.out.println("계좌번호: ");
		String account_num = scanner.next();
		
		System.out.println("예금액: ");
		int money = scanner.nextInt();
		
		Account Ac_find = Account(account_num);
		
		Ac_find.money(Ac_find.money+money);
		System.out.println("예금에 성공했습니다.");
		
		}
	
	//출금
	static void minus() {
	 	
	}
 	
 	
}