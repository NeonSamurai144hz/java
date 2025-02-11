public class ex5 {
    public static class Voiture {

        private String marque;
    
        public Voiture(String marque) {
            this.marque = marque;
        }
    
        public void afficherMarque() {
            System.out.println("La marque de la voiture est : " + marque);
        }
    
        public static void main(String[] args) {

            Voiture maVoiture = new Voiture("Hyundai");

            maVoiture.afficherMarque();
        }
    }
}