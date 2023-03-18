import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(1,123);
        Car car2 = new Car(2,234);
        Car car3 = new Car(3,763);
        DescriptionCar descriptionCar = new DescriptionCar(2018,"Sonata",3000,Color.BLACK);
        DescriptionCar descriptionCar2 = new DescriptionCar(2019,"KIA",8000,Color.WHITE);
        DescriptionCar descriptionCar3 = new DescriptionCar(2022,"Sorrento",30000,Color.SILVER);

        Map<Car,DescriptionCar>list = new HashMap<>();
        list.put(car,descriptionCar);
        list.put(car2,descriptionCar2);
        list.put(car3,descriptionCar3);

        for (Map.Entry<Car,DescriptionCar> a:list.entrySet()) {
            System.out.println(a.getKey()+" "+a.getValue());
        }
    }
}