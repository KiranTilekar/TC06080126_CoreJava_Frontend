package shop;

public abstract class PrimeAcc extends ShopAcc {
    private final boolean isPrime;
    private static final float deliveryCharges = 0.0f;

    
    public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges);
        this.isPrime = isPrime;
    }

    
    @Override
    public void bookProduct(float amount) {
        System.out.println("Product booked with amount: " + amount);
        
    }

    
    @Override
    public String toString() {
        return "PrimeAcc{" +
                "accNo=" + getAccNo() +
                ", accNm='" + getAccNm() + '\'' +
                ", charges=" + getcharges() +
                ", isPrime=" + isPrime() +
                '}';
    }

	public boolean isPrime() {
		return isPrime;
	}
}
