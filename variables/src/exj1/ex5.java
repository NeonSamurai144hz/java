
public class ex5 {
        public static void main(String[] args) {
                String myVar = "null";
                String myResult = "42".replace("42", "" + myVar).replace("null", "42");

                System.out.println(myResult);
        }
}
