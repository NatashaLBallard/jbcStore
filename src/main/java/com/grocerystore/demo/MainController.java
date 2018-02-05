package com.grocerystore.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class MainController {

    @Autowired
    JBCStoreRepository jbcStoreRepository;

    @RequestMapping("/")
    public String groceryStoreLists(Model model){
        model.addAttribute("lists", jbcStoreRepository.findAll());
        return "display";
    }

    @GetMapping("/add")
    public String jbcStoreForm(Model model) {
        model.addAttribute("gslist", new JBCStore());
        return "jbcstoreform";
    }

    @PostMapping("/process")
    public String processForm(@Valid JBCStore jbcStore, BindingResult result){
        if (result.hasErrors()) {
            return "jbcstoreform";
        }
        jbcStoreRepository.save(jbcStore);
        return "redirect:/";
    }

@Controller
public class Cosmetics{

}




class CleaningItems{

}


class Snacks{

}



}
