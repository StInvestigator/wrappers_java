package wrappers;

public class WrapperTest {
    public static void main(String[] args) {
        // 2
        Integer i1 = 10;
        Integer i2 = Integer.valueOf(10);
        Integer i3 = new Integer(10);
        Integer i4 = Integer.parseInt("10");

        Short sh1 = 10;
        Short sh2 = Short.valueOf((short) 10);
        Short sh3 = new Short((short) 10);
        Short sh4 = Short.parseShort("10");

        Long l1 = 10L;
        Long l2 = Long.valueOf(10L);
        Long l3 = new Long(10L);
        Long l4 = Long.parseLong("10");

        Double d1 = 10.5;
        Double d2 = Double.valueOf(10.5);
        Double d3 = new Double(10.5);
        Double d4 = Double.parseDouble("10.5");

        Character c1 = 'a';
        Character c2 = Character.valueOf('a');
        Character c3 = new Character('a');

        Float f1 = 10.5f;
        Float f2 = Float.valueOf(10.5f);
        Float f3 = new Float(10.5f);
        Float f4 = Float.parseFloat("10.5");

        Byte b1 = 127;
        Byte b2 = Byte.valueOf((byte) 127);
        Byte b3 = new Byte((byte) 127);
        Byte b4 = Byte.parseByte("127");

        // 3
        Double doubleVal = 10.5;
        byte b5 = doubleVal.byteValue();
        short sh5 = doubleVal.shortValue();
        int i5 = doubleVal.intValue();
        float f5 = doubleVal.floatValue();
        long l5 = doubleVal.longValue();

        // 4
        Double nan = Double.NaN;
        Double pos_inf = Double.POSITIVE_INFINITY;
        Double neg_inf = Double.NEGATIVE_INFINITY;
        double notZero = 100;
        double zero = 0;
        Double nanValue = notZero/zero;
        Double infinityValue  = zero/zero;

        System.out.println("nanValue - " + nanValue);
        System.out.println("infinityValue - " + infinityValue);

        if(nanValue.isNaN()){
            System.out.println("Variable nanValue = NaN");
        }
        else if(nanValue.isInfinite()){
            System.out.println("Variable nanValue = Infinity");
        }
        if(infinityValue.isNaN()){
            System.out.println("Variable infinityValue = NaN");
        }
        else if(infinityValue.isInfinite()){
            System.out.println("Variable infinityValue = Infinity");
        }

        //5
        Long long1 = 120L;
        Long long2 = 120L;
        System.out.println("120 | long1 == long2 is " + (long1==long2));
        long1 = 1200L;
        long2 = 1200L;
        System.out.println("1200| long1 == long2 is " + (long1==long2));
    }
}
