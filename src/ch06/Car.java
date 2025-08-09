package ch06;
//this는 현 객체 호출함, 인스턴스 멤버 호출시 사용
public class Car {
    String model;
    int speed;

    Car(String model){
        this.model=model;
    }
    void setSpeed(int speed){
        this.speed=speed;
    }
    void run(){
        this.setSpeed(100);
        System.out.println(this.model+"가 달립니다 시속"+this.speed);
    }
    static double pie = 3.141592;
    static int plus(int x, int y){return x+y;}
    static int minus(int x, int y){return x-y;}
    //정적멤버 사용할때는 객체로 접근이 아닌 그냥 클래스 이름.으로 접근

    //정적 블록 복잡한 초기화 과정
    static {
        pie=plus(7,4)+minus(7,4);
    }

    //정적 멤버는 인스턴스 멤버를 사용할 수 없다(객체가 필요없기 때문임). 굳이 쓰려면 내부에서 갹채 생성하고 쓰셈 main도 마찬가지

    //final필드, 상수
    final String nation ="대한민국";
    final String ssn; //final 필드 초기화 안 할거면 생성자에서 초기화
    String name;
    Car(String ssn, String name){
        this.ssn=ssn;
        this.name=name;
    }

    //상수는 static final 타입 상수 ,초기화는 final 과 마찬가지

}
