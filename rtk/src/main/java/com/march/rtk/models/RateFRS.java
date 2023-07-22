package com.march.rtk.models;

import jakarta.persistence.*;

@Entity
@Table(name="RateFRS")
public class RateFRS {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name_frs")
    private String name_frs;

    @Column(name = "service_work_hours_rate")
    private String service_work_hours_rate;

    // Конструктор по умолчанию нужен для Spring
    public RateFRS() {}

    public RateFRS(String name_frs, String service_work_hours_rate) {
        this.name_frs = name_frs;
        this.service_work_hours_rate = service_work_hours_rate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_frs() {
        return name_frs;
    }

    public void setName_frs(String name_frs) {
        this.name_frs = name_frs;
    }

    public String getService_work_hours_rate() {
        return service_work_hours_rate;
    }

    public void setService_work_hours_rate(String service_work_hours_rate) {
        this.service_work_hours_rate = service_work_hours_rate;
    }
}
