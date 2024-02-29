package shop;

public class EntryPoint {
    public static void main(String[] args) {
        
        ShopFactory shopFactory = new GSShopFactory();

        
        PrimeAcc primeAccount = shopFactory.getNewPrimeAcc(101, "John Doe", 0.0f, true);

        
        NormalAcc normalAccount = shopFactory.getNewNormalAcc(102, "Jane Doe", 0.0f, 50.0f);

        
        primeAccount.bookProduct(100.0f);
        normalAccount.bookProduct(100.0f);

        
        System.out.println("Prime Account Details:");
        System.out.println(primeAccount.toString());

        System.out.println("\nNormal Account Details:");
        System.out.println(normalAccount.toString());
    }
}
