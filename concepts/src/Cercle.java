public class Cercle extends Forme {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double calculerSurface() {
        return Math.PI * Math.pow(rayon, 2);
    }
}

// 4/ Abstraction : Crée une classe abstraite Forme avec une méthode abstraite calculerSurface(). Crée deux sous-classes Cercle et Rectangle :  

// Dans la classe Cercle, implémente la méthode calculerSurface() pour calculer la surface d'un cercle avec la formule π * rayon². 
// Dans la classe Rectangle, implémente la méthode calculerSurface() pour calculer la surface d'un rectangle avec la formule largeur * hauteur.

// Ensuite, dans la classe principale, crée des objets de type Cercle et Rectangle et appelle la méthode calculerSurface() sur chacun d'eux.