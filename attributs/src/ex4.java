public class ex4 { 

    public static class Compte {

        private static int nombreDeComptes = 0;

        public Compte() {
            nombreDeComptes++;
        }

        // Static method to retrieve the current count
        public static int getNombreDeComptes() {
            return nombreDeComptes;
        }
    }

    public static void main(String[] args) {

        Compte compte1 = new Compte();
        Compte compte2 = new Compte();
        Compte compte3 = new Compte();

        System.out.println("Nombre de comptes créés : " + Compte.getNombreDeComptes());
    }
}
