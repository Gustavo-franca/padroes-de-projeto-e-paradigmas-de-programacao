package Encapsulamento.exemplo1.src;


public class Car {
    private int velocity;
    private int weight;
    private boolean open;
    private boolean switchedOn;
    private CarDriver driver;
    
    public Car(){
        this.open = false;
        this.switchedOn = false;
        this.velocity = 0;
        this.weight = 2 * 1000;
        this.driver = null;
    }
    
    public void open(){
        if(this.velocity == 0 && this.switchedOn == false){
            this.open = true;
            System.out.println("Carro está aberto!");
        }
            
    }
    public void close(){
            this.open = false;
            System.out.println("Carro está fechado!");
    }
    public void turnOn() {
        if(switchedOn == false && hasDriver()){
            this.switchedOn = true;
            System.out.println("Carro está ligado!");
        }
            

    }
    private boolean hasDriver() {
        if(driver != null)return true;
        throw new Error("driver is not in the car");
    }

    public void speedUp() {
        if(hasDriver()){
            this.velocity++;
            System.out.println("the car is  acceleratin!");
        }
        
        
    }
    public void brake() {
        if(hasDriver())
            this.velocity = 0;
            System.out.println("the car is  breaking!");
    }

    public void turnOff() {
        if(hasDriver())
            switchedOn = false;
            System.out.println("the car is  off!");
    }

    public void exit() {
        if(hasDriver())
            this.driver = null;
            System.out.println("the driver gets out of the car!");
    }

    public void enter(CarDriver carDriver) {
        this.driver = carDriver;
        System.out.println("the driver gets in the car!");
    }

    


    
}
