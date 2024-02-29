package shop;

public class GSNormalAcc extends NormalAcc {
    
    private float deliveryCharges = -1;  

    
    public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
        super(accNo, accNm, charges, deliveryCharges);
        this.deliveryCharges = deliveryCharges;
    }

    
    @Override
    public void bookProduct(float amount) {
        float totalAmount = amount + getcharges() + deliveryCharges;
        System.out.println("For Normal Account");
        System.out.println("--------------------------------");
        System.out.println("Product booked with amount: " + totalAmount);
        System.out.println("Delivery charges applied for GSNormalAcc: " + deliveryCharges+"\n");
    }

    
    @Override
    public String toString() {
        return "GSNormalAcc{" +
                "accNo=" + getAccNo() +
                ", accNm='" + getAccNm() + '\'' +
                ", charges=" + getcharges() +
                ", deliveryCharges=" + deliveryCharges +
                '}';
    }

	
		
	
}

