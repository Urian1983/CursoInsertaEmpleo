package model;

public class DiscountCalculator {
    public float calculateDiscount (float discountPrice, float originalPrice){
        float discountPricePercentage = discountPrice*(100/originalPrice);

        return 100-discountPricePercentage;
    }
}
