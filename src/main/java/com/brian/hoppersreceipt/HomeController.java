package com.brian.hoppersreceipt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	// class definition and imports here...
    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "Tyrion Lannister";
        String itemName = "gold necklace";
        double price = 500.50;
        String description = "Gold necklace for my love Shae";
        String vendor = "Little Things Corner Store";
        String website = "dacorner@aol.com";
    
    	model.addAttribute("name", name);
    	model.addAttribute("itemName", itemName);
    	model.addAttribute("price", price);
    	model.addAttribute("description", description);
    	model.addAttribute("vendor", vendor);
    	model.addAttribute("website", website);
    
        return "index.jsp";
    }
    //...
    

}
