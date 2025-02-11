public class ex1 {
    public static void main(String[] args) {
        livre p = new livre();
        p.setTitle("Alice in the Wonderland");
        System.out.println(p.getTitle());
    }

    public static class livre {
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