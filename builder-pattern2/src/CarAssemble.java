public class CarAssemble 
{
    public static void main(String[] args) 
    {
        Car myCar = new Car.CarBuilder()
            .brand("TOYOTA")
            .engineType("diesel")
            .transmission("manual")
            .color("dark green")
            .passengerCapacity(5)
            .build();

        System.out.println("Car Created! Below is your car description:");
        System.out.println("\t Brand:  " + myCar.brand);
        System.out.println("\t Engine: " + myCar.engineType);
        System.out.println("\t Transmission: " + myCar.transmission);
        System.out.println("\t Color: " + myCar.color);
        System.out.println("\t Passenger Capacity: " + myCar.passengerCapacity);

        System.out.println("\n------[ SW Builder Pattern ]------\n" +
                        "by Marasigan, Vem Aiensi : 3BSCS-1");
    }
}