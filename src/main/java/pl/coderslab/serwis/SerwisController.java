package pl.coderslab.serwis;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/user/serwis")
public class SerwisController {
    @Autowired
    SerwisRepository serwisRepository;

    @GetMapping("/add")
    public String show(Model model) {
        model.addAttribute("serwis", new Serwis());
        return "serwis";
    }


    @PostMapping("/add")
    public String add(@ModelAttribute @Valid Serwis serwis, BindingResult result) {
        if (result.hasErrors()) {
            return "serwis";
        }
        //user.setPassword(passwordEncoder.encode(user.getPassword()));
        serwis.setEnabled(1);
        serwisRepository.save(serwis);
        return "redirect:all";
    }

    @GetMapping("/edit/{id}")
    public String update(@PathVariable Long id, Model model) {
        Serwis serwis = serwisRepository.findById(id).orElse(null);
        model.addAttribute(serwis);
        return "serwis";
    }

    @PostMapping("/edit/{id}")
    public String updateUser(@ModelAttribute @Valid Serwis serwis, BindingResult result) {
        if (result.hasErrors()) {
            return "serwis";
        }
        serwisRepository.save(serwis);
        return "redirect:../all";
    }


    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("serwises", serwisRepository.findAll());
    }

    @GetMapping("/all")
    public String all(Model model) {

        return "serwisList";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {

        serwisRepository.deleteById(id);
        return "redirect:../all";
    }


}
