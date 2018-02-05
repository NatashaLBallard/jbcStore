package com.grocerystore.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;

@Controller
public class MainController {


//Start of Controllers for JBC Store

    @Autowired
    JBCStoreRepository jbcStoreRepository;

    @RequestMapping("/")
    public String listJBCStores(Model model) {
        for (JBCStore jbcStore:jbcStoreRepository.findAll()){
            System.out.println(jbcStore.getJbcStoreListName());

        }
        model.addAttribute("jbcStoreLists", jbcStoreRepository.findAll());

        return "display";
    }

    @GetMapping("/add")
    public String jbcStoreForm(Model model) {
        model.addAttribute("jbcStore", new JBCStore());
        return "jbcstoreform";
    }

    @PostMapping("/process")
    public String processForm(@Valid @ModelAttribute("jbcStore") JBCStore jbcStore, BindingResult result) {
        if (result.hasErrors()) {
            return "jbcstoreform";
        }
        jbcStoreRepository.save(jbcStore);
        return "redirect:/";
    }

    @RequestMapping("/detail/{id}")
    public String showJBCStore(@PathVariable("id") long id, Model model) {
        model.addAttribute("jbcStore", jbcStoreRepository.findOne(id));
        return "show";
    }

    @RequestMapping("/update/{id}")
    public String updateJBCStore(@PathVariable("id") long id, Model model) {
        model.addAttribute("jbcStore", jbcStoreRepository.findOne(id));
        return "jbcstoreform";
    }

    @RequestMapping("/delete/{id}")
    public String delJBCStore(@PathVariable("id") long id) {
        jbcStoreRepository.delete(id);
        return "redirect:/";
    }

//End of Controllers for JBC Store




//Start of Controllers for Cosmetics

    @Autowired
    CosmeticsRepository cosmeticsRepository;

    @RequestMapping("/cosmetic")
    public String listCosmetics(Model model) {
        model.addAttribute("cosmetics", cosmeticsRepository.findAll());
        return "display";
    }

    @GetMapping("/add-cosmetic")
    public String cosmeticForm(Model model) {
        model.addAttribute("cosmetic", new Cosmetics());
        return "cosmeticform";
    }

    @PostMapping("/process-cosmetic")
    public String processCosmeticForm(@Valid Cosmetics cosmetics, BindingResult result) {
        if (result.hasErrors()) {
            return "cosmeticform";
        }
        cosmeticsRepository.save(cosmetics);
        return "redirect:/";
    }

    @RequestMapping("/detail/{cosmeticId}")
    public String showCosmetic(@PathVariable("cosmeticId") long cosmeticId, Model model) {
        model.addAttribute("cosmetic", cosmeticsRepository.findOne(cosmeticId));
        return "show";
    }

    @RequestMapping("/update/{cosmeticId}")
    public String updateCosmetic(@PathVariable("cosmeticId")long cosmeticId, Model model) {
        model.addAttribute("cosmetic", cosmeticsRepository.findOne(cosmeticId));
        return "cosmeticform";
    }

    @RequestMapping("delete/{cosmeticId}")
    public String delCosmetic(@PathVariable("cosmeticId") long cosmeticId){
        cosmeticsRepository.delete(cosmeticId);
        return "redirect:/";
    }


//End of Controllers for Cosmetics



//Start of Controllers for Cleaning Items

@Autowired
CleaningItemsRepository cleaningItemsRepository;

    @RequestMapping("/cleaning")
    public String listCleaningItems(Model model) {
        model.addAttribute("cleaningitems", cleaningItemsRepository.findAll());
        return "display";
    }

    @GetMapping("/add-cleaning")
    public String cleaningForm(Model model) {
        model.addAttribute("cleaningitem", new CleaningItems());
        return "jbcstoreform";
    }

    @PostMapping("/process-cleaning")
    public String processCleaningForm(@Valid CleaningItems cleaningItems, BindingResult result) {
        if (result.hasErrors()) {
            return "jbcstoreform";
        }
        cleaningItemsRepository.save(cleaningItems);
        return "redirect:/";
    }

    @RequestMapping("/detail/{cleaningId}")
    public String showCleaningItem(@PathVariable("cleaningId") long cleaningId, Model model) {
        model.addAttribute("cosmetic", cleaningItemsRepository.findOne(cleaningId));
        return "show";
    }

    @RequestMapping("/update/{cleaningId}")
    public String updateCleaningItem(@PathVariable("cleaningId")long cleaningId, Model model) {
        model.addAttribute("cosmetic", cleaningItemsRepository.findOne(cleaningId));
        return "jbcstoreform";
    }

    @RequestMapping("delete/{cleaningId}")
    public String delCleaningItem(@PathVariable("cleaningId") long cleaningId){
        cleaningItemsRepository.delete(cleaningId);
        return "redirect:/";
    }


//End of Controllers for Cleaning Items



//Start of Controllers for Snacks

    @Autowired
    SnacksRepository snacksRepository;

    @RequestMapping("/snacks")
    public String listSnacks(Model model) {
        model.addAttribute("snacks", snacksRepository.findAll());
        return "display";
    }

    @GetMapping("/add-snacks")
    public String snackForm(Model model) {
        model.addAttribute("snack", new Snacks());
        return "jbcstoreform";
    }

    @PostMapping("/process-snacks")
    public String processSnackForm(@Valid Snacks snack, BindingResult result) {
        if (result.hasErrors()) {
            return "jbcstoreform";
        }
        snacksRepository.save(snack);
        return "redirect:/";
    }

    @RequestMapping("/detail/{snackId}")
    public String showSnack(@PathVariable("snackId") long snackId, Model model) {
        model.addAttribute("snack", snacksRepository.findOne(snackId));
        return "show";
    }

    @RequestMapping("/update/{snackId}")
    public String updateSnack(@PathVariable("snackId")long snackId, Model model) {
        model.addAttribute("snack", snacksRepository.findOne(snackId));
        return "jbcstoreform";
    }

    @RequestMapping("delete/{snackId}")
    public String delSnack(@PathVariable("snackId") long snackId){
        snacksRepository.delete(snackId);
        return "redirect:/";
    }


//End of Controllers for Snacks



    }









