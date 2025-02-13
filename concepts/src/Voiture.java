public class Voiture {
        // encapsulation
    private double prix;
    private String modele;
    private String couleur;

        // Constructor 
    public Voiture(String modele, String couleur, double prix) {
        this.modele = modele;
        this.couleur = couleur;
        setPrice(prix);
        // this.setPrice(prix); other method
    }

    public double getPrice() {
        return prix;
    }

    public void setPrice(double newPrix) {
        double x = (newPrix + Math.abs(newPrix)) / 2;
        this.prix = x + (this.prix * (1 - Math.signum(x)));
        // this.prix = Math.max(0, newPrix); other method
    }

    public String getModel() {
        return modele;
    }

    public void setModel(String modele) {
        this.modele = modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void afficherDetails() {
        System.out.println("Modèle: " + modele + ", Couleur: " + couleur + ", Prix: " + prix);
    }
}





// 2/ Encapsulation : Dans une usine de production de voitures, chaque voiture possède des caractéristiques comme le modèle, la couleur et le prix. Ces informations doivent être encapsulées, c'est-à-dire qu'elles ne doivent être accessibles qu'à travers des méthodes définies.

// Créez une classe Voiture avec des attributs privés : modele, couleur, prix. 
// Fournissez des méthodes publiques pour accéder et modifier ces attributs (getters et setters).
// Assurez-vous que la méthode prix ne peut être modifiée qu'avec une valeur positive. 
// Ajoutez une méthode afficherDetails() qui affiche les informations sur la voiture.

