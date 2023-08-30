package ra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import ra.model.Product;

@Controller
public class HomeController {
    @GetMapping("/")
//    public String home(Model model){
//        model.addAttribute("product",new Product());
//        return "form";
//    }
    public ModelAndView home(){
        return new ModelAndView("form","product",new Product());
    }
    @PostMapping("/doForm")
    public String doForm(@ModelAttribute Product product, @RequestParam MultipartFile image){
        System.out.println(product);
        return "home";
    }
}
