//Calculatrice
public class Calculatrice {

    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }

    public int sous(int a, int b) {
        return a - b;
    }
    public double sous(double a, double b) {
        return a - b;
    }

    public int multi(int a, int b) {
        return a * b;
    }
    public double multi(double a, double b) {
        return a * b;
    }

    public int divi(int a, int b) {
        return a / b;
    }

    public double divi(double a, double b) {
        return a / b;
    }

    public double effectuerOperation(String operation, double a, double b) {
        switch (operation) {
            case "add":
                return add(a, b);
            case "sous":
                return sous(a, b);
            case "multi":
                return multi(a, b);
            case "divi":
                return divi(a, b);
            default:
                throw new IllegalArgumentException("Opération non valide : " + operation);
        }
    }

    public int effectuerOperation(String operation, int a, int b) {
        switch (operation) {
            case "add":
                return add(a, b);
            case "sous":
                return sous(a, b);
            case "multi":
                return multi(a, b);
            case "divi":
                return divi(a, b);
            default:
                throw new IllegalArgumentException("Opération non valide : " + operation);
        }
    }
}