package com.object.cards.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.object.cards.entity.Property;
import com.object.cards.service.PropertyService;
import org.springframework.ui.Model;

@Controller
public class PropertyController {
    
    private final PropertyService propertyService;

    public PropertyController(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @GetMapping("/properties")
    public String findAll(Model model){
        List<Property> properties = propertyService.findAll();
        model.addAttribute("properties", properties);
        return "property-list";
    }

    @GetMapping("/property-create")
    public String createPropertyForm(Property property){
        return "property-create";
    }

    @PostMapping("/property-create")
    public String createProperty(Property property){
        propertyService.saveProperty(property);
        return "redirect:/properties";
    }
    @GetMapping("property-delete/{id}")
    public String deleteProperty(@PathVariable("id") int id) {
        propertyService.deleteById(id);
        return "redirect:/properties";
    }

}
