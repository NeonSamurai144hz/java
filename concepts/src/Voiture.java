public class Voiture {
    // Private attributes for encapsulation
    private double prix;
    private String modele;
    private String couleur;

    // Constructor that initializes all attributes
    public Voiture(String modele, String couleur, double prix) {
        this.modele = modele;
        this.couleur = couleur;
        setPrice(prix); // Use the setter to apply the "positive only" rule
    }

    // Getter for 'prix'
    public double getPrice() {
        return prix;
    }

    // Setter for 'prix' without conditions:
    // This method only updates the price if 'newPrix' is positive.
    public void setPrice(double newPrix) {
        double f = (newPrix + Math.abs(newPrix)) / 2; // f equals newPrix if newPrix > 0, else 0
        // If f > 0, Math.signum(f) returns 1 and the new price is f.
        // If f is 0, Math.signum(0) returns 0 and the price remains unchanged.
        this.prix = f + (this.prix * (1 - Math.signum(f)));
    }

    // Getter for 'modele'
    public String getModel() {
        return modele;
    }

    // Setter for 'modele'
    public void setModel(String modele) {
        this.modele = modele;
    }

    // Getter for 'couleur'
    public String getCouleur() {
        return couleur;
    }

    // Setter for 'couleur'
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    // Method to display car details
    public void afficherDetails() {
        System.out.println("Modèle: " + modele + ", Couleur: " + couleur + ", Prix: " + prix);
    }
}





// 2/ Encapsulation : Dans une usine de production de voitures, chaque voiture possède des caractéristiques comme le modèle, la couleur et le prix. Ces informations doivent être encapsulées, c'est-à-dire qu'elles ne doivent être accessibles qu'à travers des méthodes définies.

// Créez une classe Voiture avec des attributs privés : modele, couleur, prix. 
// Fournissez des méthodes publiques pour accéder et modifier ces attributs (getters et setters).
// Assurez-vous que la méthode prix ne peut être modifiée qu'avec une valeur positive. 
// Ajoutez une méthode afficherDetails() qui affiche les informations sur la voiture.

