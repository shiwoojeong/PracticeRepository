package PaymentCode;

public class NaverPay implements Payment {

	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println("결제 결과: 네이버페이로 " + amount + "원 결제 완료!");

	}
	
}
