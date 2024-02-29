package shop;

public class GSPrimeAcc extends PrimeAcc {
    private static final float charges = 0.0f;  

    
    public GSPrimeAcc(int accNo, String accNm,float charges, boolean isPrime) {
        super(accNo, accNm,charges, isPrime);
    }

    
    @Override
    public void bookProduct(float amount) {
        float totalAmount = amount + charges;
        System.out.println("For Prime Account");
        System.out.println("-------------------------------");
        System.out.println("Product booked with amount: " + totalAmount);
        System.out.println("No extra charges for delivery for Prime Account.");
        System.out.println("Extra charges for GSPrimeAcc: " + charges+"\n");
       
    }

    
    @Override
    public String toString() {
        return "GSPrimeAcc{" +
        		"accNo=" + getAccNo() +
                ", accNm='" + getAccNm() + '\'' +
                ", charges=" + getcharges() +
                ", isPrime=" + isPrime() +
                '}';
    }
}
