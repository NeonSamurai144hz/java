public class ex13 {
    public static void main(String[] args) {
        int a = 24, b = 42;

        System.out.println("Before swap: a = " + a + ", b = " + b);


        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}