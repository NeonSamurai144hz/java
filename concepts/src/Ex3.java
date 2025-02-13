public class Ex3 {
        public static void main(String[] args) {
            Employe directeur = new Directeur(); // on envoye un objet de type Directeur a la classe Employe
            directeur.travailler(); // on appelle la methode travailler() de Directeur
    
            Employe employe = new Enseignant(); // meme chose mais avec un objet de type Enseignant
            employe.travailler(); // on appelle la methode travailler() d Enseignant
        }
}
// Files attached Employe, Directeur, Enseignant, PersonnelAdministratif

// Polymorphisme : Dans une école, il y a différents types d'employés, comme des enseignants, des directeurs et des personnels administratifs. 
// Tous ces employés doivent avoir une méthode travailler() qui décrit leurs tâches, mais chaque type d'employé a un comportement spécifique.

// Créez une classe Employe avec une méthode travailler(). 
// Créez des sous-classes comme Enseignant, Directeur et PersonnelAdministratif, chacune redéfinissant la méthode travailler() 
// pour décrire son rôle spécifique (par exemple, l'enseignant enseigne, le directeur gère l'école, etc.). 
// Testez le polymorphisme en créant des objets de chaque sous-classe et en appelant la méthode travailler().