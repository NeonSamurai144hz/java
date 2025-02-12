public class AvionDeChasse extends Avion{
    @Override
    public  String decoller() {
        return "Decollage de l'avion de chasse";
    }
}


// 5/ @override : Nous avons un porte-avion qui doit gérer plusieurs avions. Le porte-avion peut lancer des 
//avions et chaque type d'avion peut avoir un comportement de décollage spécifique.

// Créer une classe Avion qui définit une méthode générique decoller(). 
// Créer des classes dérivées comme AvionDeChasse et AvionDeTransport, qui redéfiniront la méthode decoller() 
//en fonction de leurs comportements spécifiques. 
// Créer la classe PorteAvion qui gère une liste d'avions et permet de les faire décoller.