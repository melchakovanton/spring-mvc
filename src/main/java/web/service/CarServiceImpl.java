package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> listCars() {
        List<Car> listCars = new ArrayList<>();
        Car bmw = new Car(1, "BMW", "Red");
        Car subaru = new Car(2, "Subaru", "Yellow");
        Car porsche = new Car(3, "Porsche", "Blue");
        listCars.add(bmw);
        listCars.add(subaru);
        listCars.add(porsche);
        return listCars;
    }
}
