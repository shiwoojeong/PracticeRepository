package PaymentCode;

public class Main  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentService Service = new PaymentService();
		
		Payment mykakao = new KaKaoPay();
		Service.process(mykakao, 10000);
		
		Payment mynaver = new NaverPay();
		Service.process(mynaver, 15000);
		
		
		
		
	}

}


