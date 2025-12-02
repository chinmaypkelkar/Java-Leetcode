package JavaPractice;

public class FlatDiscountStrategy implements IDiscountStrategy {

    int flatDiscount = 20;
    @Override
    public int calculateDiscount(int price) {
        System.out.println("In Flat Discount");
        return flatDiscount;
    }

}
