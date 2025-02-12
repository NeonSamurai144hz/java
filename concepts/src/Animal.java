public abstract class Animal {

    protected String nom;
    
    // Constructeur pour initialiser le nom
    public Animal(String nom) {
        this.nom = nom;
    }
    
    // Méthode commune à tous les animaux
    public void manger() {
        System.out.println(nom + " mange.");
    }
        
    // Méthode abstraite (sans corps) - doit être implémentée par les sous-classes
    public abstract void seDeplacer();
    
}
