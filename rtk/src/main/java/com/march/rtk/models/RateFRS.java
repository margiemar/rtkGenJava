package com.march.rtk.models;

import jakarta.persistence.*;
//import javax.validation.constraints.NotBlank;

@Entity
@Table(name="rate_frs")
public class RateFRS {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "name_frs")
    private String nameFRS;

    @Column(name = "service_work_hours_rate")
    private String serviceWorkHoursRate;

    // Конструктор по умолчанию нужен для Spring
    public RateFRS() {}

    public RateFRS(String nameFRS, String serviceWorkHoursRate) {
        this.nameFRS = nameFRS;
        this.serviceWorkHoursRate = serviceWorkHoursRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getnameFRS() {
        return nameFRS;
    }

    public void setnameFRS(String nameFRS) {
        this.nameFRS = nameFRS;
    }

    public String getserviceWorkHoursRate() {
        return serviceWorkHoursRate;
    }

    public void setserviceWorkHoursRate(String serviceWorkHoursRate) {
        this.serviceWorkHoursRate = serviceWorkHoursRate;
    }
}
