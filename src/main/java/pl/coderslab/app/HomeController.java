package pl.coderslab.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
/*import pl.coderslab.app.order.Order;
import pl.coderslab.app.order.OrderDAO;
import pl.coderslab.app.order.OrderRepository;
import pl.coderslab.app.user.User;
import pl.coderslab.app.user.UserRepository;
import pl.coderslab.app.user.UserService;
import pl.coderslab.app.warehouse.WarehouseService;*/
import pl.coderslab.car.CarRepository;
import pl.coderslab.cfm.Cfm;
import pl.coderslab.serwis.SerwisRepository;
import pl.coderslab.user.User;
import pl.coderslab.user.UserRepository;
import pl.coderslab.user.UserService;
import pl.coderslab.zlec.ZlecRepostiory;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


@Controller
@SessionAttributes("remoteUser")
public class HomeController {


    private UserRepository userRepository;
    private UserService userService;
    private CarRepository carRepository;
    private ZlecRepostiory zlecRepostiory;
    private SerwisRepository serwisRepository;

    public HomeController( SerwisRepository serwisRepository, UserRepository userRepository, UserService userService, CarRepository carRepository, ZlecRepostiory zlecRepostiory) {

        this.userRepository = userRepository;
        this.userService = userService;
        this.zlecRepostiory = zlecRepostiory;
        this.carRepository = carRepository;
        this.serwisRepository=serwisRepository;
    }


    @RequestMapping("/")
    public String hello() {


        return "dashboard";
    }

    @PostMapping("/")
    public String helloo (@ModelAttribute Model model){
        Long cari = carRepository.count();
        Long zleci = zlecRepostiory.count();
        Long userei = userRepository.count();
        Long serwi = serwisRepository.count();


        model.addAttribute("cari",cari);
        model.addAttribute("zleci", zleci);
        model.addAttribute("userei", userei);
        model.addAttribute("serwi",serwi);
        return "dashboard";

    }

    @GetMapping("/mylogin")
    public String getLogin(Model model, @RequestParam(required = false) String username) {
        if (username != null) {
            model.addAttribute("username", username);
        }
        return "login";
    }

    @RequestMapping("/404")
    public String error404 () {

        return "404";
    }

    @GetMapping("/myregistration")
    public String registration(Model model) {
        model.addAttribute("user", new User());
        return "registration";
    }

    @PostMapping("/myregistration")
    public String createNewUser(Model model, @ModelAttribute @Validated User user, BindingResult result) {
        User userExist = userRepository.findByEmail(user.getEmail());
        if (userExist != null) {
            result
                    .rejectValue("email", "error.user",
                            "There is already a user registered with the email provided");
        }
        if (result.hasErrors()) {
            return "registration";
        } else {
            userService.saveUser(user);
        }
        model.addAttribute("username", user.getFirstName());
        return "redirect:/mylogin?success";
    }



}