import java.util.*;

public class ex9 {
    public static void main(String[] args) {

        Random rand = new Random();
        int max=42,min=1;
        int randNum = rand.nextInt(max - min + 1) + min;
        String result = ("" + randNum).replace("42", "true");

        System.out.println(result);
    }
}