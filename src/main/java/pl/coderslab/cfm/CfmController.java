package pl.coderslab.cfm;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user/cfm")
public class CfmController {

    @Autowired
    CfmRepository cfmRepository;

        @GetMapping("/add")
        public String show(Model model) {
            model.addAttribute("cfm", new Cfm());
            return "cfm";
        }

/*    @RequestMapping(value = "/addForm", method = RequestMethod.POST)
    public String add (@ModelAttribute User user){
         userRepository.save(user);
         return "redirect:all";
    }*/

        @PostMapping("/add")
        public String add(@ModelAttribute Cfm cfm, BindingResult result) {
            if(result.hasErrors()) {
                return "cfm";
            }
            //user.setPassword(passwordEncoder.encode(user.getPassword()));
            cfm.setEnabled(1);
            cfmRepository.save(cfm);
            return "redirect:all";
        }

        @GetMapping("/edit/{id}")
        public String update(@PathVariable Long id, Model model) {
            Cfm cfm = cfmRepository.findById(id).orElse(null);
            model.addAttribute(cfm);
            return "user";
        }

        @PostMapping("/edit/{id}")
        public String updateCfm(@ModelAttribute  Cfm cfm, BindingResult result) {
            if(result.hasErrors()) {
                return "cfm";
            }
            cfmRepository.save(cfm);
            return "redirect:../all";
        }



        @ModelAttribute
        public void addAttributes(Model model) {
            model.addAttribute("cfms", cfmRepository.findAll());
        }

        @GetMapping("/all")
        public String all(Model model) {
//        List<User> users = userRepository.findAll();
//        model.addAttribute("users", users);
            return "cfmList";
        }

        @GetMapping("/delete/{id}")
        public String delete(@PathVariable Long id) {


            cfmRepository.deleteById(id);
            return "redirect:../all";
        }


}
