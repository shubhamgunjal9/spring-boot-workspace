package in.paymentapp;

public class DebitcardPayment implements Payment {

	@Override
	public String pay(double ammount) {
		// TODO Auto-generated method stub
		return "payment successfull using debit card:-"+ammount;
	}

}