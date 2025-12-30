package PaymentCode;

public class KaKaoPay implements Payment {

	@Override
	public void pay(int amount) {
		System.out.println("결제 결과: 카카오페이로 " + amount + "원 결제 완료!");
	}
	
}
