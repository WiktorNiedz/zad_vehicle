interface Vehicle{
    void run();
    void stop();
    static String getService(){
        return "pojazd wymaga serwisu";
    }
}
class Car implements Vehicle{
    public void run(){
        System.out.println("pojazd jedzie");;
    }
    public void stop(){
        System.out.println("pojazd nie jedzie");
    }
}
class Motor implements Vehicle{
    public void run(){
        System.out.println("pojazd jedzie");
    }
    public void stop(){
        System.out.println("pojazd nie jedzie");
    }
}



public class Main {
    public static void main(String[] args) {
Motor motor = new Motor();
Car car = new Car();
motor.run();
car.run();
motor.stop();
car.stop();
        Vehicle.getService();

    }

}