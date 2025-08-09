package ch06.GetterSetter;
/*
Setter = 외부에서 값을 입력할 때, 필드에 직접 접근하지 못하게 막고 메소드로 검증 후 내부에서 접근함
Getter = 외부에서 값을 읽을 때 , 외부에 사용하기 적절한 값으로 메소드를 이용 변환하여 리턴

작성 방법
    private 타입 이름

    public 필드타입 get이름(){return 필드}
    public void 타입 set이름(필드이름){this.필드=매개변수}

    private boolean stop;
    public boolean isStop(){return stop}
 */
public class Car {
    private int speed;
    private boolean stop;

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        if(speed<0){
            this.speed=0;
        }
        else{
            this.speed = speed;
        }
    }

    public boolean isStop() {
        return stop;
    }
    public void setStop(boolean stop) {
        this.stop = stop;
        if(stop == true) this.speed=0;
    }
}
