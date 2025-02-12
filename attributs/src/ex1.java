public class ex1 {
    public static void main(String[] args) {
        Livre p = new Livre();
        p.setTitle("Alice in the Wonderland");
        System.out.println(p.getTitle());
    }

    public static class Livre {
        private String titre;
        
        // Getter pour nom
        public String getTitle() {
            return titre;
        }
    
        // Setter pour nom
        public void setTitle(String titre) {
            this.titre = titre;
        }
    }
}