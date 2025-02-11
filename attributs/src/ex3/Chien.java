package ex3;

    public class Chien extends Animal {
        public Chien(String nom) {
            super(nom);
        }
    
        public void afficherNom() {
            System.out.println("Le nom du chien est : " + nom);
        }
    }