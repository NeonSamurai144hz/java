public class Ex4 {
    public static void main(String[] args) {
        Forme rectangle = new Rectangle( /* largeur */ 5, /* hauteur */ 10);
        rectangle.calculerSurface(); // Affiche "L'animal fait du bruit"

        Forme cercle = new Cercle(3.14 /* rayon */);
        cercle.calculerSurface(); // Affiche "L'animal fait du bruit"

        System.out.println("Surface du rectangle : " + rectangle.calculerSurface());
        System.out.println("Surface du cercle : " + cercle.calculerSurface());
    }
}
// Forme, Cercle, Rectangle


// 4/ Abstraction : Crée une classe abstraite Forme avec une méthode abstraite calculerSurface(). Crée deux sous-classes Cercle et Rectangle :  

// Dans la classe Cercle, implémente la méthode calculerSurface() pour calculer la surface d'un cercle avec la formule π * rayon². 
// Dans la classe Rectangle, implémente la méthode calculerSurface() pour calculer la surface d'un rectangle avec la formule largeur * hauteur.

// Ensuite, dans la classe principale, crée des objets de type Cercle et Rectangle et appelle la méthode calculerSurface() sur chacun d'eux.
