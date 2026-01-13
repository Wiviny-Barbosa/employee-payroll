package domain;

public class OutsourceEmployee extends Employee{
	private Double additionalCharge;
	
	public OutsourceEmployee() {
		super();
	}
	
	public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public Double payment() {
		//Double aux = additionalCharge * 1.1;
		//return hours * valuePerHour + aux;
		return super.payment() + additionalCharge * 1.1;
	}
}