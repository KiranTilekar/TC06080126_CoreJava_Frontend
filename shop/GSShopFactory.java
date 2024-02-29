package shop;

public class GSShopFactory extends ShopFactory {
    
    @Override
    public GSPrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isSalaried) {
        
        return new GSPrimeAcc(accNo, accNm, charges, isSalaried);
    }

    
    @Override
    public GSNormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
        return new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
    }
}

