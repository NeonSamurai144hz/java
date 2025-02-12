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

// 2/ Encapsulation : Dans une usine de production de voitures, chaque voiture possède des caractéristiques comme le modèle, 
// la couleur et le prix. Ces informations doivent être encapsulées, c'est-à-dire qu'elles ne doivent être accessibles qu'à 
// travers des méthodes définies.

// Créez une classe Voiture avec des attributs privés : modele, couleur, prix. 
// Fournissez des méthodes publiques pour accéder et modifier ces attributs (getters et setters).
// Assurez-vous que la méthode prix ne peut être modifiée qu'avec une valeur positive. 
// Ajoutez une méthode afficherDetails() qui affiche les informations sur la voiture.