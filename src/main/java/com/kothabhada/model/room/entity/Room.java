package com.kothabhada.model.room.entity;

import javax.persistence.*;

@Entity
@Table(name="tbl_room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Column(name="floor", nullable = false)
    private String floor;
    @Column(name="location", nullable = false)
    private String location;
    @Column(name="price", nullable = false)
    private Float price;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
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
        return "Room{" +
                "id=" + id +
                ", floor='" + floor + '\'' +
                ", location='" + location + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", facility='" + facility + '\'' +
                ", rules='" + rules + '\'' +
                '}';
    }
}
