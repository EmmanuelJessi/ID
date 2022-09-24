public class Vehicales{

    String Registrationnumber;
    String model;
    String color;
    String make;
    String enginenumber;
    String chasisnumber;
    String name;


    public vehicales( String name, String Regnum, String md, String cor, String engnum, String mk, String chnum)
    {
        name = name;
        Registrationnumber = Regnum;
        model = md;
        color = cor;
        enginenumber = engnum;
        make = mk;
        chasisnumber = chnum;

    }

    public Vehicales(String mak2, String s, String jf9865, String red, String s1, String s2) {
    }

    public void distance_moved_for_each_car(int distance)
    {

        int distance_moved_by_vehicales= distance * 50000;
        System.out.println("fee for all studients is "+ consultancy_fee);
    }
    public void bed_fee(int number_of_days_admitted){
        int bed_fee = number_of_days_admitted * 60000;
        System.out.println("the bed fee is multiplied by 60000 is "+ bed_fee);
    }
    public void display(){
        System.out.println("the Registrationnumber is "+ Registrationnumber);
        System.out.println("the model is "+ model);
        System.out.println("the color is "+ color);
        System.out.println("the enginenumber is "+enginenumber);
        System.out.println("the make is "+make);
        System.out.println("the chasisnumber is "+chasisnumber);


    }
    public static void main(String[] args) {
        Vehicales object1 = new Vehicales("Toyota","210277376","My8977","black","267654443324js","265665");
       object1.distance_moved(20);
       object1.display();

       //second object

        Vehicales object2 = new Vehicales("mak2", "283792838", "JF9865", "red", "28762873655", "002314");
        object2.distance_moved(30);
        object2.display();

        //third object


        Vehicales  object3 = new Vehicales ("Benz", "22873666", "K2733245646", "yellow", "2887354355", "0034643");
        object3.distance_moved(60);
        object3.display();

        //fourth object

        Vechicales object4 = new Vehicales ("Hammer", "445265362", "M23", "green", "34773487727", "99898388");
        object4.distance_moved(40);
        object4.display(); 

        //fifth object

        Vechicales objects5 = new Vechicales ("Corona", "8765342948", "2019", "white", "76504847", "245346565");
        obects5.distance_move();
        objects5.display();

    }

    private void distance_moved(int i) {
    }
}