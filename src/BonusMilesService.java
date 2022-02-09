public class BonusMilesService {
    public int calculate(int price) {
        int priceForMile = 20;

        int mile = price * 1 / priceForMile;
        return mile;
    }
}
