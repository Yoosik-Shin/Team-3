package _05._08.encapsulation;

public class PhoneStore {
	private Phone phone;
	
	public PhoneStore(Phone phone) {
		this.phone = phone;
	}
	
	public Phone sellPhone(String model, double budget) {
		String phoneModel = phone.getModel();
		
		if (model.equals(phoneModel) && budget >= phone.getPrice()) {
			registerPayment();
			discountPromotion();
			saveData();
			return phone;
			
		}
		else return null;

	}
	private void saveData() {
		// TODO Auto-generated method stub
		
	}

	private void discountPromotion() {
		// TODO Auto-generated method stub
		
	}

	private void registerPayment() {
		System.out.println("대리점: 요금제를 등록합니다. 약정을 등록합니다.");
	}

}
