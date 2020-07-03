package com.kothabhada.model.flat.entity;

import javax.persistence.*;

@Entity
@Table(name="tbl_flat")
public class Flat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name="flat_id",nullable = false, unique = true)
    private Long id;
    @Column(name="floor",nullable = false)
    private String floor;
    @Column(name="location",nullable = false)
    private String location;
    @Column(name="price", nullable = false)
    private String price;
    @Column(name="rooms", nullable = false)
    private String rooms;
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

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
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
        return "flat{" +
                "id=" + id +
                ", floor='" + floor + '\'' +
                ", price='" + price + '\'' +
                ", rooms='" + rooms + '\'' +
                ", description='" + description + '\'' +
                ", facility='" + facility + '\'' +
                ", rules='" + rules + '\'' +
                '}';
    }
}
