package week_4.task3;

public class WrapperTest {
    public static void main(String[] args) {

        char c='A';
        boolean b = true;
        int i =12;
        short s=34;
        double d=67;
        long l=56;
        byte by=78;
        float f=67;

        Character charObject =c;
        Boolean booleanObject =b;
        Integer intObject=i;
        Short shortObject=s;
        Double doubleObject=d;
        Long longObject=l;
        Byte byteObject= by;
        Float floatObject=f;

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Autoboxing");
        System.out.println("Character object: "+ charObject);
        System.out.println("Boolean object: " +booleanObject);
        System.out.println("Integer object: "+intObject);
        System.out.println("Short object: "+shortObject);
        System.out.println("Double object: "+doubleObject);
        System.out.println("Long object: "+longObject);
        System.out.println("Byte object: "+byteObject);
        System.out.println("Float object: "+floatObject);

        char charType= charObject;
        boolean cooleanType =booleanObject;
        int intergerType=intObject;
        short shortType=shortObject;
        double doubleType=doubleObject;
        long longType=longObject;
        byte byteType=byteObject;
        float floatType=floatObject;

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Unboxing");
        System.out.println("Character varible: "+ charType);
        System.out.println("Boolean varible: " +byteType);
        System.out.println("Integer varible: "+intergerType);
        System.out.println("Short varible: "+shortType);
        System.out.println("Double varible: "+doubleType);
        System.out.println("Long varible: "+longType);
        System.out.println("Byte varible: "+byteType);
        System.out.println("Float varible: "+floatType);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    }

}
