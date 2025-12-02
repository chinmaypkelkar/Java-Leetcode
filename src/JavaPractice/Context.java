package JavaPractice;

public class Context {
    
    private IDiscountStrategy discountStrategy;
    
    public Context(IDiscountStrategy discountStrategy){
        this.discountStrategy = discountStrategy;
    }

    public int calculate(int price){
        return this.discountStrategy.calculateDiscount(price);
    }
}
