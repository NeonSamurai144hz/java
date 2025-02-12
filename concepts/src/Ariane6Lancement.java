public class Ariane6Lancement {
    public void lancer(Fusee fusee) {
        fusee.lancer();
    }
}

// // super()
// class Animal {
//     public Animal(String nom) {
//         System.out.println("Un animal nommé " + nom);
//     }
// }

// class Chien extends Animal {
//     public Chien(String nom) {
//         super(nom);  // Appelle le constructeur de la super-classe Animal
//         System.out.println("Un chien nommé " + nom);
//     }
// }


// 6/ super() :  Nous avons une classe de base Fusee qui représente une fusée générique, et une classe dérivée Ariane6 pour la fusée Ariane 6. 
// La classe dérivée ajoutera des comportements spécifiques, mais nous n'utiliserons pas @Override. La méthode de lancement sera celle de la classe 
// parente, mais nous ajouterons des comportements supplémentaires dans la classe dérivée.

// Créer une classe de base Fusee qui a un constructeur pour initialiser le nom et le poids, et une méthode lancer(). 
// Faire en sorte que Fusee est les attributs nom et poids.
// Créer une sous-classe Ariane6 qui hérite de Fusee et ajoute un comportement spécifique pour le lancement et la séparation 
// des étages, mais sans utiliser @Override. 
// Créer un class Ariane6Lancement permettant de lancer Ariane6 dans un Main.
// Utiliser super() pour appeler le constructeur de la classe parente dans la sous-classe.