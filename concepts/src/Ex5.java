public class Ex5 {
    public static void main(String[] args) {
        Avion S14 = new AvionDeChasse();
        Avion A380 = new AvionDeTransport();
        PorteAvion porteAvion = new PorteAvion();

        porteAvion.addAvion(S14);
        porteAvion.addAvion(A380);

        System.out.println(porteAvion.avion.get(0).decoller());
    }
}

//Avion, AvionDeChasse, AvionDeTransport, PorteAvion

// 5/ @override : Nous avons un porte-avion qui doit gérer plusieurs avions. Le porte-avion peut lancer des avions et chaque type d'avion peut avoir un comportement de décollage spécifique.

// Créer une classe Avion qui définit une méthode générique decoller(). 
// Créer des classes dérivées comme AvionDeChasse et AvionDeTransport, qui redéfiniront la méthode decoller() en fonction de leurs comportements spécifiques. 
// Créer la classe PorteAvion qui gère une liste d'avions et permet de les faire décoller.