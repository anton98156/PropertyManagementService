package com.object.cards.entity;

public class Property {
    
    // Описание объекта недвижимости.
    private int id;
    private String address;
    private String description;
    private int space;
    private boolean sublease;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public boolean getSublease() {
        return sublease;
    }

    public void setSublease(boolean sublease) {
        this.sublease = sublease;
    }

}
