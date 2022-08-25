package com.angelo.marcio.employerList.domain;

import java.util.Objects;
import java.util.UUID;

public class Employer {

    private UUID uuid;
    private String name;
    private Integer yearsExp;
    private String description;
    private Tech mainTech;

    public Employer(){
        super();
    }

    public Employer(UUID uuid, String name, Integer yearsExp, String description, Tech mainTech) {
        this.uuid = uuid;
        this.name = name;
        this.yearsExp = yearsExp;
        this.description = description;
        this.mainTech = mainTech;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYearsExp() {
        return yearsExp;
    }

    public void setYearsExp(Integer yearsExp) {
        this.yearsExp = yearsExp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Tech getMainTech() {
        return mainTech;
    }

    public void setMainTech(Tech mainTech) {
        this.mainTech = mainTech;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employer employer = (Employer) o;
        return Objects.equals(uuid, employer.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid);
    }
}
