package com.kothabhada.model.house.entity;

import javax.persistence.*;

@Entity
@Table(name="tbl_house")
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name="house_id", nullable = false, unique = true)
    private Long id;
    @Column(name="floors",nullable = false)
    private String floors;
    @Column(name="location",nullable = false)
    private String location;
    @Column(name="price", nullable = false)
    private String price;
    @Column(name="description")
    private String description;
    @Column(name="facility")
    private String facility;
    @Column(name="rules")
    private String rules;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFloors() {
        return floors;
    }

    public void setFloors(String floors) {
        this.floors = floors;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", floors='" + floors + '\'' +
                ", location='" + location + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                ", facility='" + facility + '\'' +
                ", rules='" + rules + '\'' +
                '}';
    }
}
