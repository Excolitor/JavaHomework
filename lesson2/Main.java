package lesson2;

public class Main {
    static int integerValue;
    static long longerValue;
    static byte littleValue;
    static Integer intWrappedValue;
    static Long longWrappedValue;
    static Byte byteWrappedValue;

    public static void main(String[] args) {
        int myInt = 0;
        byte myByte = 0;
        float myFloat = 0.0F;

        Integer iWrapped = 0;
        Byte bWrapped = 0;
        Float fWrapped = 0.0F;

        DataHolder holder = new DataHolder();

        holder.setIntValue(1000);
        holder.setByteValue((byte) 125);
        holder.setFloatValue(5.5f);

        myInt = holder.getIntValue();
        myByte = holder.getByteValue();
        myFloat = holder.getFloatValue();


        byte b = 10;
        int i = b;
        long l = i;
        double d = l;

        double secondD = 9.99;
        int secondI = (int) secondD;

        long big = 300L;
        byte small = (byte) big;

        Integer boxed = 100;
        int unboxed = boxed;

        Integer nullable = null;
        // int x = nullable;

        Integer a = 1000;
        Integer c = 1000;
        System.out.println(a == c);
        System.out.println(a.equals(c));


        System.out.println("DataHolder.byteValue = " + holder.getByteValue());
        System.out.println("DataHolder.shortValue = " + holder.getShortValue());
        System.out.println("DataHolder.intValue = " + holder.getIntValue());
        System.out.println("DataHolder.longValue = " + holder.getLongValue());
        System.out.println("DataHolder.floatValue = " + holder.getFloatValue());
        System.out.println("DataHolder.doubleValue = " + holder.getDoubleValue());
        System.out.println("DataHolder.charValue = " + holder.getCharValue());
        System.out.println("DataHolder.boolValue = " + holder.getBoolWrapedValue());

        System.out.println("static int = " + integerValue);
        System.out.println("static long = " + longerValue);
        System.out.println("static byte = " + littleValue);

        System.out.println("local int = " + myInt);
        System.out.println("local byte = " + myByte);
        System.out.println("local float = " + myFloat);

    }

}