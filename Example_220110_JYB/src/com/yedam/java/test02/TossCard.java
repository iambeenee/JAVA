package com.yedam.java.test02;

public class TossCard extends Card {

	// 필드
	private String company = "Toss";
	private String cardStaff;

	// 생성자
	public TossCard(String cardNum, int vaildDate, int cvc, String cardStaff) {
		super(cardNum, vaildDate, cvc);
		this.cardStaff = cardStaff;
	}

	// 메소드
	@Override
	public void showCardInfo() {
		System.out.println("카드정보 - Card NO : " + cardNum);
		System.out.println("담당직원 - " + cardStaff + ", " + company);
	}

}
