public class Main {

    public static void main(String[] args) {
        // ошибка двойного округления
        DoubleRoundingErrorVerifier.verify();
        // сравнение ulp
        System.out.println(Math.ulp(0.1f));
        System.out.println(CustomMath.ulp(0.1f));
    }
}
