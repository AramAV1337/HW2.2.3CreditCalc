import java.lang.Math;

public class CreditCalc {
    public double calculate(int summ, double percent, int month) {
        double result; // Результат
        double monthlyPercent; // Месячная процентная ставка
        double coeff; // Коэффициент
        double annCoefficient; // Коэффициент аннуитета
        monthlyPercent = (percent / month) / 100;
        coeff = Math.pow((1 + monthlyPercent), month);
        annCoefficient = (monthlyPercent * coeff) / (coeff - 1);
        result = summ * annCoefficient;
        ;

        return result;
    }
}
