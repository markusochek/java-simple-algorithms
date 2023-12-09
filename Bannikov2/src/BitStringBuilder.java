public class BitStringBuilder {

    public static String bitString(Float number) {
        StringBuilder bitString = new StringBuilder(Integer.toBinaryString(Float.floatToIntBits(number)));
        addZeroBits(bitString);
        return new String(bitString);
    }

    private static void addZeroBits(StringBuilder bitString) {
        while (bitString.length() != Float.SIZE) {
            bitString.insert(0, "0");
        }
    }

}
