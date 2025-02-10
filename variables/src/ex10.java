public class ex10 {
    public static void main(String[] args) {
                int my42TypeInt = 42;
                double my42TypeDouble = 42.0;
                boolean my42TypeBoolean = true;
                char my42TypeChar = 'J';
                String my42TypeString = "Hello";
                float my42TypeFloat = 42.42f;
                long my42TypeLong = 4242424242L;
                short my42TypeShort = 32000;
                byte my42TypeByte = 127;
        
                String typeInt = ((Object) my42TypeInt).getClass().getSimpleName();
                String typeDouble = ((Object) my42TypeDouble).getClass().getSimpleName();
                String typeBoolean = ((Object) my42TypeBoolean).getClass().getSimpleName();
                String typeChar = ((Object) my42TypeChar).getClass().getSimpleName();
                String typeString = my42TypeString.getClass().getSimpleName();
                String typeFloat = ((Object) my42TypeFloat).getClass().getSimpleName();
                String typeLong = ((Object) my42TypeLong).getClass().getSimpleName();
                String typeShort = ((Object) my42TypeShort).getClass().getSimpleName();
                String typeByte = ((Object) my42TypeByte).getClass().getSimpleName();
        
                System.out.println(typeInt);    // Integer
                System.out.println(typeDouble); // Double
                System.out.println(typeBoolean); // Boolean
                System.out.println(typeChar);   // Character
                System.out.println(typeString); // String
                System.out.println(typeFloat);  // Float
                System.out.println(typeLong);   // Long
                System.out.println(typeShort);  // Short
                System.out.println(typeByte);   // Byte
            }
}
