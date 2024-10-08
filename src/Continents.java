public class Continents {
    int continent = 4;

    //constructor method.
    public Continents(){

    }

    public String continentIdentification(){
        switch (continent){
            case 1:
                return "North America: Mexico City, Mexico";
            case 2:
                return "South America: Sao Paulo, Brazil";
            case 3:
                return "Europe: Moscow, Russia";
            case 4:
                return "Africa: Lagos, Nigeria";
            case 5:
                return "Asia: Shanghai, China";
            case 6:
                return "Australia: Sydney, Australia";
            case 7:
                return "Antarctica: McMurdo Station, US";
            default:
                return "Undefined continent!";
        }
    }

    public static void main(String[] args){

        Continents continent1 = new Continents();

        System.out.println(continent1.continentIdentification());
    }
}
