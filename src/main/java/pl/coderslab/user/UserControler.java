package pl.coderslab.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.cfm.Cfm;
import pl.coderslab.cfm.CfmRepository;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/admin/user")
public class UserControler {
    @Autowired
    UserRepository userRepository;
    @Autowired
    CfmRepository cfmRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @GetMapping("/add")
    public String show(Model model) {
        model.addAttribute("user", new User());
        return "user";
    }

/*    @RequestMapping(value = "/addForm", method = RequestMethod.POST)
    public String add (@ModelAttribute User user){
         userRepository.save(user);
         return "redirect:all";
    }*/

    @PostMapping("/add")
    public String add(@ModelAttribute @Valid User user, BindingResult result) {
        if(result.hasErrors()) {
            return "user";
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "redirect:all";
    }

    @GetMapping("/edit/{id}")
    public String update(@PathVariable Long id, Model model) {
        User user = userRepository.findById(id).orElse(null);
        model.addAttribute(user);
        return "user";
    }

    @PostMapping("/edit/{id}")
    public String updateUser(@ModelAttribute @Valid User user, BindingResult result) {
        if(result.hasErrors()) {
            return "user";
        }
        userRepository.save(user);
        return "redirect:../all";
    }

    @GetMapping("/{id}/cfm")
    public String userTweets (@PathVariable Long id, Model model) {
        User user = userRepository.findById(id).orElse(null);
        List<Cfm> cfms = cfmRepository.findByUserId(id);
        model.addAttribute("cfm", cfms);
        model.addAttribute("user", user);
        return "userTweets";
    }

    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("users", userRepository.findAll());
    }

    @GetMapping("/all")
    public String all(Model model) {
//        List<User> users = userRepository.findAll();
//        model.addAttribute("users", users);
        return "userList";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        List<Cfm> cfms = cfmRepository.findAll();
        for (Cfm t : cfms) {
            if(t.getUser().getId() == id) {
                cfmRepository.deleteById(t.getId());
            }
        }
        userRepository.deleteById(id);
        return "redirect:../all";
    }

   /* @GetMapping("/search-tweets")
    public String search(Model model) {
        List<Cfm> cfms = cfmRepository.findFirstByTitleStartingWithOrderByCreated("a");
        model.addAttribute("tweets", cfms);
        return "tweetList";
    }*/
}
