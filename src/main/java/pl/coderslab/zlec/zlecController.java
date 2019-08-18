package pl.coderslab.zlec;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class zlecController {

    @ModelAttribute("status")
    public Collection<String> skills() {
        List<String> skills = new ArrayList<String>();
        skills.add("stworzone");
        skills.add("zautoryzowane");
        skills.add("odrzucone");
        skills.add("zafakturowane");
        return skills;
    }
}
