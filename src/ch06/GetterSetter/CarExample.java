package ch06.GetterSetter;

public class CarExample {
    public static void main(String[] args){
        Car car = new Car();

        car.setSpeed(-50);
        System.out.println(car.getSpeed());

        car.setSpeed(50);
        System.out.println(car.getSpeed());
        car.setSpeed(-70);
        if(car.isStop()){
            car.setStop(true);
        }
        System.out.println(car.getSpeed());
    }
}
