package PaymentCode;

public class PaymentService {

	public void process(Payment payment, int amount) {
		System.out.println("--- 결제 프로세스를 시작합니다 ---");
        payment.pay(amount); // 실제 전달된 객체(카카오 또는 네이버)의 pay()가 실행됩니다.
        System.out.println("--- 결제가 안전하게 종료되었습니다 --- \n");
	}
}
