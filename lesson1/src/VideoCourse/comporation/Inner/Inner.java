package VideoCourse.comporation.Inner;

public class Inner {
    public static void main(String[] args) {
       // Car.Engine engine=new Car.Engine(256);
    Car1 car = new Car1("black",4);
    Car1.Engine engine=car.new Engine(150);
    car.setEngine(engine);
    System.out.println(car);
    Car1.Engine engine3=new Car1("yellow",4).new Engine(200);

}}

class Car1 {
    String color;
    int doorCount;
    Engine engine;


    public Car1(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
        //this.engine = this.new Engine(horsePower);
    }
    public void setEngine(Engine engine){
        this.engine=engine;
    }
    @Override
    public String toString() {
        return "My Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }
    public    class Engine{
        private int horsePower;


        public Engine(int horsePower) {
            System.out.println(doorCount);
            this.horsePower = horsePower;

        }

        @Override
        public String toString() {
            return "MyEngine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}