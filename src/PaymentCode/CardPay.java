package PaymentCode;

public class CardPay implements Payment{

	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println("결제 결과: 카드결제로 " + amount + "원 결제 완료!");

	}

}
