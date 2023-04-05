package java_test;

import java.util.Scanner;

public class BankApplication {
	static Account[] Ac = new Account[100];
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
					//menu();
					break;
					
				case 3:
					//plus();
					break;
					
				case 4:
					//minus();
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
	
	static void creat() {
		System.out.println(">> 계좌생성 <<");
		System.out.println("\n");
		
		System.out.println("계좌번호:");
		String account_num = scanner.next();
		
		System.out.println("이름:");
		String name = scanner.next();
		
		System.out.println("초기 입금액:");
		int money = scanner.nextInt();
	}
}