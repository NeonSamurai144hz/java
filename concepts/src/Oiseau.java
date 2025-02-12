public class Oiseau extends Animal {

    public Oiseau(String nom) {
        super(nom);
    }

    @Override
    public void seDeplacer() {
        System.out.println("L'oiseau " + nom + " se déplace en volant.");
    }
    
    // Méthode spécifique aux oiseaux
    public void voler() {
        System.out.println("L'oiseau " + nom + " vole.");
    }
}