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

    // Вывод отчета о всех объектах недвижимости пользователю.
    @GetMapping("/properties")
    public String findAll(Model model){
        List<Property> properties = propertyService.findAll();
        model.addAttribute("properties", properties);
        return "property-list";
    }

    // Просмотр объекта недвижимости.
    @GetMapping("/property-open/{id}")
    public String findById(@PathVariable("id") int id, Model model) {
        Property properties = propertyService.findById(id);
        model.addAttribute("property", properties);
        return "property-open";
    }

    // Переход на форму создания нового объекта.
    @GetMapping("/property-create")
    public String createPropertyForm(Property property){
        return "property-create";
    }

    // Создание объекта недвижимости.
    @PostMapping("/property-create")
    public String createProperty(Property property){
        propertyService.saveProperty(property);
        return "redirect:/properties";
    }


    // Переход на форму обновления объекта недвижимости.
    @GetMapping("/property-update/{id}")
    public String updatePropertyForm(Property property){
        return "property-update";
    }

    // Обновление объекта недвижимости.
    @PostMapping("/property-update")
    public String updateProperty(Property property, int id) {
        propertyService.updateById(property, id);
        return "redirect:/properties";
    }

    // Удаление объекта недвижимости.
    @GetMapping("/property-delete/{id}")
    public String deleteProperty(@PathVariable("id") int id) {
        propertyService.deleteById(id);
        return "redirect:/properties";
    }

}