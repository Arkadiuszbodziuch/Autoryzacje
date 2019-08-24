package pl.coderslab.zlec;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.acctions.Actions;
import pl.coderslab.acctions.ActionsRepository;
import pl.coderslab.car.Car;
import pl.coderslab.car.CarRepository;
import pl.coderslab.status.StatusRepository;

import javax.servlet.http.HttpSession;
import java.util.*;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/zlec")
@SessionAttributes("zlecM")
public class ZlecController {

    private ActionsRepository actionsRepository;
    private ZlecRepostiory zlecRepostiory;
    private CarRepository carRepository;
    private StatusRepository statusRepository;


    private ZlecController (ZlecRepostiory zlecRepostiory,
                            CarRepository carRepository,
                            ActionsRepository actionsRepository,
                            StatusRepository statusRepository){

        this.statusRepository=statusRepository;
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
/*
        Status status=statusRepository.findByName("Dodane");
*/

        if (car!=null){

            zlec.setCar(car);
            /*zlec.setStatus(status);*/
            zlecRepostiory.save(zlec);

            model.addAttribute("zlecM", zlec);
        }
        return "redirect:/zlec/addActions";
    }

    @GetMapping("/addActions")
    public String addActions (Model model, HttpSession ses) {




        List<Actions> actionsEntities = actionsRepository.findAll();
        List<String> actions = actionsEntities.stream().map(Actions::getName).collect(Collectors.toList());

        Zlec zlec = (Zlec) ses.getAttribute("zlecM");

        model.addAttribute("zlec", new Zlec());
        model.addAttribute("actions", actions);

        zlecRepostiory.save(zlec);


        return "addActions";

    }


    @RequestMapping(value = "/addActions" , method = RequestMethod. POST)
    public String editCustomer(@RequestParam(value = "actions", required = false) String [] checkboxValue,
                             HttpSession session,
                             Model model)


    {

        Zlec zlec = (Zlec) session.getAttribute("zlecM");


            System.out.println("checkbox is checked");

        List<Actions> actionsSet = new ArrayList<>();
            for (int i=0; i<checkboxValue.length; i++){
                System.out.println(checkboxValue[i]);
                System.out.println("n");



            actionsSet.add(actionsRepository.findAllByName(checkboxValue[i]));


            }
            System.out.println(checkboxValue);

            zlec.setActions(actionsSet);

            zlecRepostiory.save(zlec);



return "redirect:/";
    }

    /*@PostMapping("/addActions")
    public  String addActions1(@ModelAttribute Actions actions,
                               HttpSession session,
                               Model model,
                               BindingResult result){

        model.addAttribute("actions", actions);
        Zlec zlec = (Zlec) session.getAttribute("zlecM");

        System.out.println(actions.toString());
        return"sucess";

    }

*/



    @GetMapping("/all")
    public String getAllZlecs (Model model){
        List<Zlec> zlecList = zlecRepostiory.findAll();
        model.addAttribute("zlecList", zlecList);
        return "zlecList";
    }


}