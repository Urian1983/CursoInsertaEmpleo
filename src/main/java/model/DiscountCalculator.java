package model;

public class DiscountCalculator {
    public float calculateDiscount (float discountPrice, float originalPrice){
        return discountPrice*(100/originalPrice);
    }
}
