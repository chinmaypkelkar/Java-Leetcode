package JavaPractice;

public class PercentageDiscountStrategy implements IDiscountStrategy {
    int discountPercentage = 10;
    @Override
    public int calculateDiscount(int price) {
       System.out.println("In Percentage Discount");
       return (price * discountPercentage) / 100;
    }
}
