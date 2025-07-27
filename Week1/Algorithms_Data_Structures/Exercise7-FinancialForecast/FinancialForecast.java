public class FinancialForecast {
    public static double calculateFutureValue(double value, double rate, int years) {
        if (years == 0) {
            return value;
        }
        return calculateFutureValue(value * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {
        double currentValue = 10000;
        double growthRate = 0.10;
        int futureYears = 5;

        double result = calculateFutureValue(currentValue, growthRate, futureYears);
        System.out.println("Future Value after " + futureYears + " years: " + result);
    }
}
