package pl.coderslab.zlec;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.acctions.Actions;
import pl.coderslab.acctions.ActionsRepository;
import pl.coderslab.car.Car;
import pl.coderslab.car.CarRepository;

import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
@RequestMapping("/zlec")
@SessionAttributes("zlecM")
public class ZlecController {

    private ActionsRepository actionsRepository;

    private ZlecRepostiory zlecRepostiory;
    private CarRepository carRepository;


    private ZlecController (ZlecRepostiory zlecRepostiory,CarRepository carRepository,ActionsRepository actionsRepository){
        this.zlecRepostiory=zlecRepostiory;
        this.actionsRepository=actionsRepository;
        this.carRepository=carRepository;
    }


    @GetMapping("/add")
    public String addZlec (Model model){


        model.addAttribute("zlec", new Zlec());

        return "zlec";
    }


    @PostMapping ("/add")
        public String addZlec (@ModelAttribute Zlec zlec,
                               @RequestParam String string,
                               Model model) {

        Car car = carRepository.findByRegistrationNumber(string);
        if (car!=null){

            zlec.setCar(car);
            zlecRepostiory.save(zlec);
            model.addAttribute("zlecM", zlec);
        }
            return "redirect:/zlec/addActions";
        }

        @GetMapping("/addActions")
        public String addActions (Model model, HttpSession ses){
            Zlec zlec = (Zlec) ses.getAttribute("zlecM");
            model.addAttribute("zlec", zlec);


//            List<Actions> actionsSet = new ArrayList<>();
//            actionsSet.add(actionsRepository.getOne(1l));
//            zlec.setActions(actionsSet);
            zlecRepostiory.save(zlec);




          //  user.setRole(new HashSet<Role>(Arrays.asList(userRole)));


            return "addActions";

        }

        @PostMapping("/addActions")
        public  String addActions1(){

        return"sucess";

    }


    @ModelAttribute("actions")
    public List<String> actionsList() {

        List<String> actionsList = new ArrayList<>();
        actionsList.add("asdasda");
        return actionsList;

    }








   /* @PostMapping("/add")
    public String addZlec (@ModelAttribute Zlec zlec){
       // if (zlec.getRegistrationNumber().equals(carRepository.findAllByRegistrationnumber()))
       // zlecRepostiory.save(zlec);
        return "redirect:/zlec/all";
        }*/


        @GetMapping("/all")
        public String getAllZlecs (Model model){
            List<Zlec> zlecList = zlecRepostiory.findAll();
            model.addAttribute("zlecList", zlecList);
            return "zlecList";
        }


    }
