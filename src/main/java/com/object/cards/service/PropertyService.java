package com.object.cards.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.object.cards.entity.Property;
import com.object.cards.storage.PropertyRepository;

@Service
public class PropertyService {

    private final PropertyRepository propertyRepository;

    // Релазиация методов PropertyRepository.

    public PropertyService(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    public List<Property> findAll(){
        return propertyRepository.findAll();
    }

    public Property findById(int id){
        return propertyRepository.findById(id);
    }

    public Property saveProperty(Property property){
        return propertyRepository.save(property);
    }

    public void updateById(Property property, int id) {
        propertyRepository.updateById(property, id);
    }

    public void deleteById(int id) {
        propertyRepository.deleteById(id);
    }
}
