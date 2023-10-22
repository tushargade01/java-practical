class Continent{
    String continentName;

    Continent(String name){
        continentName = name;
    }

    public void displayContinent(){
        System.out.println("Continent: "+continentName);
    }
}
class Country extends Continent{
    String countryName;

    Country(String continentName,String name){
        super(continentName);
        countryName = name;
    }

    public void displayCountry(){
        System.out.println("Country: "+countryName);
    }
}

class State extends Country{
    String stateName;
    State(String continentName,String countryName,String name){
        super(continentName,countryName);
        stateName = name;
    }
    public void displayState(){
        System.out.println("State: "+stateName);
    }
}
class Place extends State{
    String placeName;
    Place(String continentName, String countryName, String stateName, String name){
        super(continentName,countryName,stateName);
        placeName = name;
    }
    public void displayPlace(){
        System.out.println("Place: "+placeName);
    }
}
public class q5_inheritance {

    public static void main(String args[]){
        Place places = new Place("Asia","India","Maharashtra","Karjat");
        places.displayContinent();
        places.displayCountry();
        places.displayState();
        places.displayPlace();
    }    
}
