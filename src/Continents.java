public class Continents {
    int continent = 4;

    //constructor method.
    public Continents(){

    }

    public String continentIdentification(){
        switch (continent){
            case 1:
                return "North America: Mexico City, Mexico";
                break;
            case 2:
                return "South America: Sao Paulo, Brazil";
                break;
            case 3:
                return "Europe: Moscow, Russia";
                break;
            case 4:
                return "Africa: Lagos, Nigeria";
                break;
            case 5:
                return "Asia: Shanghai, China";
                break;
            case 6:
                return "Australia: Sydney, Australia";
                break;
            case 7:
                return "Antarctica: McMurdo Station, US";
                break;
            default:
                return "Undefined continent!";
        }
    }

    public static void main(String[] args){

    }
}
