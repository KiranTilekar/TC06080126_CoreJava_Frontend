package shop;

public abstract class NormalAcc extends ShopAcc {
    private final float deliveryCharges;

    
    private float creditLimit = -1.0f;

    
    public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
        super(accNo, accNm, charges);
        this.deliveryCharges = deliveryCharges;
    }

    
    @Override
    public String toString() {
        return "NormalAcc{" +
                "accNo=" + getAccNo() +
                ", accNm='" + getAccNm() + '\'' +
                ", charges=" + getcharges() +
                ", deliveryCharges=" + deliveryCharges +
                ", creditLimit=" + creditLimit +
                '}';
    }

	public abstract void bookProduct(float amount);
}

