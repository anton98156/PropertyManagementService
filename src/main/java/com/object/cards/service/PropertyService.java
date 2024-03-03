package com.object.cards.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.object.cards.repository.PropertyRepository;
import com.object.cards.entity.Property;

@Service
public class PropertyService {
    private final PropertyRepository propertyRepository;

    public PropertyService(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    public List<Property> findAll(){
        return propertyRepository.findAll();
    }

    public Property saveProperty(Property property){
        return propertyRepository.save(property);
    }

    public void deleteById(int id) {
        propertyRepository.deleteById(id);
    }
}
