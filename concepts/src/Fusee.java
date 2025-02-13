public class Fusee {
    int poids;
    String nom;

    public Fusee(String nom, int poids) {
        this.nom = nom;
        this.poids = poids;
    }

    protected void lancer() {
        System.out.println("Preparation du lancement de la fusee: " + this.nom); 
    }
}
// 6/ super() :  Nous avons une classe de base Fusee qui représente une fusée générique, et une classe dérivée Ariane6 pour la fusée Ariane 6. 
// La classe dérivée ajoutera des comportements spécifiques, mais nous n'utiliserons pas @Override. La méthode de lancement sera celle de la classe 
// parente, mais nous ajouterons des comportements supplémentaires dans la classe dérivée.

// Créer une classe de base Fusee qui a un constructeur pour initialiser le nom et le poids, et une méthode lancer(). 
// Faire en sorte que Fusee est les attributs nom et poids.
// Créer une sous-classe Ariane6 qui hérite de Fusee et ajoute un comportement spécifique pour le lancement et la séparation 
// des étages, mais sans utiliser @Override. 
// Créer un class Ariane6Lancement permettant de lancer Ariane6 dans un Main.
// Utiliser super() pour appeler le constructeur de la classe parente dans la sous-classe.