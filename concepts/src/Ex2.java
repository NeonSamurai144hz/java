public class Ex2 {
    public static void main(String[] args) {
            // Creer une voiture avec les attributs modele, couleur, prix
        Voiture v = new Voiture("Toyota", "Rouge", 25000);
        v.afficherDetails();

            // On essayer de modifier le prix avec une valeur négative pour voir si la validation fonctionne
        double oldPrice = v.getPrice();
        v.setPrice(-5000);
        v.afficherDetails();
        System.out.println("Old price was: " + oldPrice + ", after trying negative, price is: " + v.getPrice());

            // on essaie de modifier le prix pour une autre valeur positive pour voir si la validation fonctionne
        v.setPrice(30000);
        v.afficherDetails();
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