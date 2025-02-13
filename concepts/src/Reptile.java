public class Reptile extends Animal {

    public Reptile(String nom) {
        super(nom);
    }

    @Override
    public void seDeplacer() {
        System.out.println("Le reptile " + nom + " se déplace en rampant.");
    }
    
    public void ramper() {
        System.out.println("Le reptile " + nom + " rampe.");
    }
}