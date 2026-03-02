public class TypeConversionExample {
    public static void main(String[] args) {

        int num = 100;
        double doubleNum = num;   // Implicit casting

        System.out.println("Integer value: " + num);
        System.out.println("Converted to double: " + doubleNum);

        double decimal = 9.78;
        int intValue = (int) decimal;   // Explicit casting

        System.out.println("Double value: " + decimal);
        System.out.println("Converted to int: " + intValue);
    }
}
