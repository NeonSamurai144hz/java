public class ex4 {
    public static void main(String[] args) {
        // Création d'un objet de la classe Compteur
        Compteur monCompteur = new Compteur();

        // Appel de la méthode d'instance pour incrémenter le compteur
        monCompteur.incrementer(5); // Incrémente le compteur de 5
        monCompteur.incrementer(10); // Incrémente le compteur de 10

        // Appel de la méthode statique pour afficher la valeur du compteur
        Compteur.afficherCompteur(monCompteur); // Affiche "Valeur du compteur : 15"
    }
}
