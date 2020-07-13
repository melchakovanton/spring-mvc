package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {
    CarService carService = new CarServiceImpl();

    @GetMapping(value ="/cars")
    public String getAllCars(Model model) {
        List<Car> carList = carService.listCars();
        model.addAttribute("cars", carList);
        return "cars";
    }
}
