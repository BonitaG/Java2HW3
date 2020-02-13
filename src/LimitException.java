public class LimitException extends Exception{
    String message;
    double remainingAmount;


    public double getRemainingAmount() {
        return remainingAmount;
    }
    public LimitException(String message, double remainingAmount) {
        this.message = message;
        this.remainingAmount = remainingAmount;
    }
}
