class Compteur {
    // Variable d'instance pour stocker la valeur du compteur
    private int compteur;

    // Méthode d'instance pour incrémenter la valeur du compteur
    public void incrementer(int valeur) {
        compteur += valeur; // Ajoute la valeur à la variable compteur
    }

    // Méthode statique pour afficher la valeur actuelle du compteur
    public static void afficherCompteur(Compteur c) {
        System.out.println("Valeur du compteur : " + c.compteur); // Affiche la valeur du compteur
    }

    // Constructeur pour initialiser le compteur à zéro
    public Compteur() {
        compteur = 0;
    }
}