public class Rectangle extends Forme {
    private double largeur;
    private double hauteur;

    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public double calculerSurface() {
        return largeur * hauteur;
    }
}

// 4/ Abstraction : Crée une classe abstraite Forme avec une méthode abstraite calculerSurface(). Crée deux sous-classes Cercle et Rectangle :  

// Dans la classe Cercle, implémente la méthode calculerSurface() pour calculer la surface d'un cercle avec la formule π * rayon². 
// Dans la classe Rectangle, implémente la méthode calculerSurface() pour calculer la surface d'un rectangle avec la formule largeur * hauteur.

// Ensuite, dans la classe principale, crée des objets de type Cercle et Rectangle et appelle la méthode calculerSurface() sur chacun d'eux.