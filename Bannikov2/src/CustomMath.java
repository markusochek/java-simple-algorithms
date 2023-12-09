public class CustomMath {

    // Вычисляет значение ulp для x
    // Возводит 2 в степень (эксопненты числа - 127 - 24 + 1),
    // где 127 хз не помню, -24 потому что число типа float и + 1 ну так надо/
    public static float ulp(float x) {
        final String EXPONENT = BitStringBuilder.bitString(x).substring(1, 9);
        return (float) Math.pow(2, Integer.parseInt(EXPONENT, 2) - 127 - 24 + 1);
    }

}
