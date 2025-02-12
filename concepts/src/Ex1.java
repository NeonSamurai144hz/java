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