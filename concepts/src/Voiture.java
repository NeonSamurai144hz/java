public class Voiture {
    // Private attributes
    private double prix;
    private String modele;
    private String couleur;

    // Constructor that initializes all attributes
    public Voiture(String modele, String couleur, double prix) {
        this.modele = modele;
        this.couleur = couleur;
        setPrix(prix);  // Use the setter to ensure the price is positive
    }

    // Getter for prix
    public double getPrix() {
        return prix;
    }

    // Setter for prix with a check for positive values
    public void setPrix(double prix) {
        if (prix > 0) {
            this.prix = prix;
        } else {
            System.out.println("Erreur: Le prix doit être positif.");
        }
    }

    // Getter for modele
    public String getModele() {
        return modele;
    }

    // Setter for modele
    public void setModele(String modele) {
        this.modele = modele;
    }

    // Getter for couleur
    public String getCouleur() {
        return couleur;
    }

    // Setter for couleur
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    // Method to display the car's details
    public void afficherDetails() {
        System.out.println("Modèle: " + modele + ", Couleur: " + couleur + ", Prix: " + prix);
    }

}




// 2/ Encapsulation : Dans une usine de production de voitures, chaque voiture possède des caractéristiques comme le modèle, la couleur et le prix. Ces informations doivent être encapsulées, c'est-à-dire qu'elles ne doivent être accessibles qu'à travers des méthodes définies.

// Créez une classe Voiture avec des attributs privés : modele, couleur, prix. 
// Fournissez des méthodes publiques pour accéder et modifier ces attributs (getters et setters).
// Assurez-vous que la méthode prix ne peut être modifiée qu'avec une valeur positive. 
// Ajoutez une méthode afficherDetails() qui affiche les informations sur la voiture.

