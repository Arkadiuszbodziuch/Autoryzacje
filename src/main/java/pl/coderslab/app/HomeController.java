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
import pl.coderslab.user.User;
import pl.coderslab.user.UserRepository;
import pl.coderslab.user.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


@Controller
@SessionAttributes("remoteUser")
public class HomeController {

   // private WarehouseService warehouseService;
   // private OrderDAO orderDAO;
    private UserRepository userRepository;
    private UserService userService;
    //private OrderRepository orderRepository;

    public HomeController(UserRepository userRepository, UserService userService){
          //  , OrderRepository orderRepository, OrderDAO orderDAO, WarehouseService warehouseService) {
        this.userRepository = userRepository;
        this.userService = userService;
       // this.orderRepository = orderRepository;
        //this.orderDAO = orderDAO;
        //this.warehouseService = warehouseService;
    }

    @RequestMapping("/")
    public String hello(Model model, HttpServletRequest request) {

        /*List<Order> orderList = orderRepository.findAll();
        List<Order> notFinishOrder = orderRepository.findAllByIsFinish(false);
        List<Order> orderDoneList = orderRepository.findAllByIsFinish(false);
        Order order = orderRepository.findFirstByIsFinishOrderByCreatedOnDesc(false);
        int numberOfPartsNeeded = warehouseService.getNumberOfPartsNeeded();
        model.addAttribute("numberOfPartsNeeded", numberOfPartsNeeded);
        model.addAttribute("remoteUser", request.getRemoteUser());
        model.addAttribute("orderSize", orderList.size());
        model.addAttribute("notFinishOrderSize", notFinishOrder.size());
        model.addAttribute("orderList", orderDoneList);
        model.addAttribute("data",order);*/

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