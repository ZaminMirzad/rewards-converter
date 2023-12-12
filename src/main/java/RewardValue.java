public class RewardValue {
    private final double cashValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // Constructor to accept cashValue
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    // Constructor to accept milesValue
    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    // Method to convert cash to miles
    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    // Method to convert miles to cash
    private static double convertToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    // Method to return the cashValue
    public double getCashValue() {
        return cashValue;
    }

    // Method to return milesValue
    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}
