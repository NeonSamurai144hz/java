public class Ex2 {
        // Main method for testing
        public static void main(String[] args) {
            Voiture v = new Voiture("Toyota", "Rouge", 25000);
            v.afficherDetails();  // Expected: Modèle: Toyota, Couleur: Rouge, Prix: 25000.0
            
            // Try to set a negative price; this should not change the price
            v.setPrix(-5000);
            v.afficherDetails();  // Price remains unchanged if negative value is rejected
        }
}
