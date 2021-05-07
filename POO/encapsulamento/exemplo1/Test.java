package POO.encapsulamento.exemplo1;

public class Test {

    public static void main(String[] args) {

        CarDriver carDriver = new CarDriver();
        Car car = new Car();

        /* the driver opens  the car */ 
        car.open();
        /* the driver gets in the car */
        car.enter(carDriver);
        /* the driver closes the door*/
        car.close();
        // the driver starts the car
        car.turnOn();
        // the driver  accelerates the car
        car.speedUp();
        // the driver brekes the car 
        car.brake();
        // the driver shuts down the car
        car.turnOff();
        // the driver gets out of the car
        car.exit();
        // the driver closes the car
        car.close();
        

    

    }
    
}
