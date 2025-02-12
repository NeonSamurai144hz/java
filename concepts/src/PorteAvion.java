import java.util.ArrayList;
import java.util.List;

public class PorteAvion {
    public List<Avion> avion = new ArrayList<Avion>();
    public void addAvion(Avion a) {
        avion.add(a);
    }
}

// 5/ @override : Nous avons un porte-avion qui doit gérer plusieurs avions. Le porte-avion peut lancer des 
//avions et chaque type d'avion peut avoir un comportement de décollage spécifique.

// Créer une classe Avion qui définit une méthode générique decoller(). 
// Créer des classes dérivées comme AvionDeChasse et AvionDeTransport, qui redéfiniront la méthode decoller() 
//en fonction de leurs comportements spécifiques. 
// Créer la classe PorteAvion qui gère une liste d'avions et permet de les faire décoller.