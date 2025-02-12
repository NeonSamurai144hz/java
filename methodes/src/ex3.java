public class ex3 {
    public static void main(String[] args) {
        Calculatrice calc = new Calculatrice();

        System.out.println("Addition : " + calc.effectuerOperation("add", 5, 3));
        System.out.println("Addition float: " + calc.effectuerOperation("add", 5.5, 3.2));
        System.out.println("Soustraction : " + calc.effectuerOperation("sous", 8, 2));
        System.out.println("Soustraction float: " + calc.effectuerOperation("sous", 8.7, 2.4));
        System.out.println("Multiplication : " + calc.effectuerOperation("multi", 4, 3));
        System.out.println("Multiplication float: " + calc.effectuerOperation("multi", 4.1, 3.0));
        System.out.println("Division : " + calc.effectuerOperation("divi", 9.0, 3.0));
        System.out.println("Division float: " + calc.effectuerOperation("divi", 9.3, 3.2));

    }
}
