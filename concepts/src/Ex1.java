public class Ex1 {
    public static void main(String[] args) {
        // Création des animaux avec leur nom
        Animal chien = new Mammifere("Chien");
        Animal aigle = new Oiseau("Aigle");
        Animal serpent = new Reptile("Serpent");
        
        // Appel de la méthode manger (commune à tous les animaux)
        chien.manger();
        aigle.manger();
        serpent.manger();
        
        // Appel de la méthode seDeplacer qui est redéfinie dans chaque sous-classe
        chien.seDeplacer();
        aigle.seDeplacer();
        serpent.seDeplacer();
        
        // Pour appeler des méthodes spécifiques, il faut caster la référence
        ((Mammifere) chien).marcher();
        ((Oiseau) aigle).voler();
        ((Reptile) serpent).ramper();
    }
}

// Files attached Animal, Mammifere, Oiseau, Reptile

// 1/ Héritage : Dans un zoo, il existe plusieurs types d'animaux, tels que des mammifères, des oiseaux, et des reptiles. 
// Tous les animaux ont certaines caractéristiques communes, comme un nom et une méthode pour manger. Cependant, chaque type 
// d'animal a des comportements spécifiques. Par exemple, les oiseaux volent, tandis que les mammifères marchent, les reptiles rampe.

// Créez une classe abstraite Animal avec un attribut nom et une méthode abstraite seDeplacer().
// Créez des sous-classes telles que Mammifere, Oiseau et Reptile qui héritent de Animal et redéfinissent la méthode seDeplacer(). 
// Ajoutez des méthodes spécifiques à chaque type d'animal, par exemple, voler() pour Oiseau et marcher() pour Mammifere.
