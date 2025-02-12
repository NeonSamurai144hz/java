import ex2.Etudiant;

public class ex2 {
    public static void main(String[] args) {
        Etudiant p = new Etudiant();
        p.nom = "Alice";
        p.age = 20;

        System.out.println("Nom de l'étudiant : " + p.nom);
        System.out.println("Age de l'etudiant: " + p.age);

    }
}