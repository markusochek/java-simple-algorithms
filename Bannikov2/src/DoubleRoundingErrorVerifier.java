import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class DoubleRoundingErrorVerifier {

    public static void verify() {
        System.out.println("Заданное число:");
        BigDecimal prettyNumber = getPrettyNumber();
        System.out.println(prettyNumber);

        System.out.println("Заданное число в float64:");
        double prettyNumberInFloat64 = prettyNumber.doubleValue();
        System.out.println(prettyNumberInFloat64);

        System.out.println("Заданное число в float32:");
        float prettyNumberInFloat32 = prettyNumber.floatValue();
        System.out.println(prettyNumberInFloat32);

        System.out.println("Заданное число из float64 в float32:");
        float prettyNumberFromFloat64ToFloat32 = (float) prettyNumberInFloat64;
        System.out.println(prettyNumberFromFloat64ToFloat32);

        System.out.println("Их битовое представление:");
        System.out.println(BitStringBuilder.bitString(prettyNumberInFloat32));
        System.out.println(BitStringBuilder.bitString(prettyNumberFromFloat64ToFloat32));
    }

    // Задаёт значащие знаки числа, округление, контекст и формирует число.
    // 54 - сигнификанд double (53) + 1 на всякий случай
    private static BigDecimal getPrettyNumber() {
        final int PRECISION = 54;
        final int SCALE = 54;
        MathContext ctx = new MathContext(PRECISION, RoundingMode.HALF_EVEN);
        BigDecimal prettyNumber = new BigDecimal("0", ctx).setScale(SCALE, RoundingMode.HALF_EVEN);

        return prettyNumber.add(new BigDecimal("2", ctx).pow(53))
                .add(new BigDecimal("2", ctx).pow(29))
                .add(new BigDecimal("1", ctx))
                .multiply(new BigDecimal("5", ctx).pow(53))
                .divide(new BigDecimal("10", ctx).pow(53), RoundingMode.HALF_EVEN);
    }

}
