package pl.coderslab.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/user/car")
public class CarController {

    @Autowired
    CarRepository carRepository;

    @GetMapping("/add")
    public String show(Model model) {
        model.addAttribute("car", new Car());
        return "car";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Car Car, BindingResult result) {
        Car.setEnabled(1);
        Car.setRegistrationNumber(Car.getRegistrationNumber().toUpperCase());



        carRepository.save(Car);
        return "redirect:all";
    }

    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("cars", carRepository.findAll());

    }


    @GetMapping("/all")
    public String all(Model model) {


        return "carList";
    }


    @GetMapping("/all/history")
    public String allHistory(Model model) {


        return "carListHistory";
    }


    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id, Model model) {
        Car car = carRepository.findById(id).orElse(null);
        car.setEnabled(0);
        carRepository.save(car);

        return "redirect:../all";

    }

    @RequestMapping("/delete/{id}")
    public String delete() {
        return "car";
    }


    @GetMapping("/edit/{id}")
    public String update(@PathVariable Long id, Model model) {
        Car car = carRepository.findById(id).orElse(null);
        model.addAttribute(car);
        return "car";
    }

    @PostMapping("/edit/{id}")
    public String updateCar(@ModelAttribute @Valid Car car, BindingResult result) {
        if (result.hasErrors()) {
            return "car";
        }
        carRepository.save(car);
        return "redirect:../all";
    }


}
