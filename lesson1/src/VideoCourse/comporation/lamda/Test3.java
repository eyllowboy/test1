package VideoCourse.comporation.lamda;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class Test3 {
    public static ArrayList<Car> createTreeCar(Supplier<Car> carSupplier) {
        ArrayList<Car> a1 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            a1.add(carSupplier.get());
        }
        return a1;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer ){
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createTreeCar(() ->
                new Car("Nissan", "siler",1.6));
        System.out.println(ourCars);

        System.out.println(ourCars);    }
}

class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}