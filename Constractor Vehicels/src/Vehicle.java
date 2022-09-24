public class Vehicle {
    String vehicle_reg_num;
    String vehicle_model;
    String vehicle_color;
    String vehicle_make;
    String vehicle_engine_num;
    String vehicle_chasis_num;
    public Vehicle( String reg_num, String mod, String color, String make, String ve, String vc)
    {
        vehicle_reg_num= reg_num;
        vehicle_model= mod;
        vehicle_color= color;
        vehicle_make= make;
        vehicle_engine_num= ve;
        vehicle_chasis_num=vc;
    }
    public void Vehicle_fee(int newmilegage, int oldmilegage )
    {
        int distance= newmilegage-oldmilegage;
        System.out.println("the distance moved is"+distance);
    }
    public void display()
    {
        System.out.println("the vehicle vehicle_reg_num is"+ vehicle_reg_num);
        System.out.println("the vehicle mod is"+ vehicle_model);
        System.out.println("the vehicle color is"+vehicle_color);
        System.out.println("the vehicle make is"+ vehicle_make);
        System.out.println("the vehicle engine num is"+ vehicle_engine_num);
        System.out.println("the vehicle casis num is"+vehicle_chasis_num);
    }
    public static void main(String[] args) {
        Vehicle veh1 = new Vehicle("1234", "Benz", "white", "toyota", "v20", "Tubular");
        veh1.Vehicle_fee(20, 10);
        veh1.display();

        Vehicle veh2 = new Vehicle("789", "MarkX", "black", "toyota", "v8", "backbone");
        veh2.Vehicle_fee(10, 5);
        veh2.display();

        Vehicle veh3 = new Vehicle("1569", "JF", "Red", "toyota", "c25", "Tubular");
        veh3.Vehicle_fee(30, 5);
        veh3.display();

    }
}