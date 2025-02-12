public class Mammifere extends Animal {

    public Mammifere(String nom) {
        super(nom);
    }

    @Override
    public void seDeplacer() {
        System.out.println("Le mammifère " + nom + " se déplace en marchant.");
    }
    
    public void marcher() {
        System.out.println("Le mammifère " + nom + " marche.");
    }
}