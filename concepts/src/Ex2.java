public class Ex2 {
    public static void main(String[] args) {
        // Create an instance of Voiture
        Voiture v = new Voiture("Toyota", "Rouge", 25000);
        v.afficherDetails();  // Should display: Modèle: Toyota, Couleur: Rouge, Prix: 25000.0

        // Try to set a negative price; since negative values are not allowed, the price remains unchanged.
        double oldPrice = v.getPrice();
        v.setPrice(-5000);
        v.afficherDetails();
        System.out.println("Old price was: " + oldPrice + ", after trying negative, price is: " + v.getPrice());

        // Now update with a positive price
        v.setPrice(30000);
        v.afficherDetails();  // Should update the price to 30000.
    }
}
// Files attached Voiture