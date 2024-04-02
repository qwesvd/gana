package exception_Ex;

import exception_Ex.InsufficientException;

//은행계좌 클래스
public class Account {
	//맴버변수(필드)
	//매서드(기능)
	static final String BANKNAME="신한은행";//정적멤버변수 대문자로 작성
	//static final부터는 변수가 아닌 상수다.
	String accountNo; //계좌번호-인스턴스멤버변수
	String ownerName; //예금주 이름-인스턴스멤버변수
	int balance; //잔액-인스턴스멤버변수
	
	//생성자
	//객체를 생성과 동시에 초기화하는것
	public Account(String accno, String owName, int bal) {
		this.accountNo=accno;//매개변수와 맴버변수의 이름이 같으면 this.를 붙인다.
		this.ownerName=owName;
		this.balance=bal;
	}
	
	
	//생성자
	public Account() {//빈 생성자,객체가 형성되며 아무값도 안 받음
		
	}
	
	
	//예금한다는 메서드
	void deposit(int amount) {
		balance+=amount; //balance=balance+amount;
	}
	//인출한다는 메서드
	int withdraw(int amount) throws InsufficientException {
		if(balance< amount) {
			throw new InsufficientException("잔고 부족(" + (amount-balance) + ")모자람");
		}
		balance-=amount; //balance=balance-amount;
		return amount;
	}
	
	
	
	
	
	
}
