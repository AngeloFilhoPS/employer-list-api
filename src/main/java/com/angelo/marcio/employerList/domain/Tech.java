package com.angelo.marcio.employerList.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Tech {

    private UUID uuid;
    private String name;
    private String description;
    private List<Employer> listOfEmployer = new ArrayList<>();

    public Tech(){
        super();
    }

    public Tech(UUID uuid, String name, String description) {
        this.uuid = uuid;
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Employer> getListOfEmployer() {
        return listOfEmployer;
    }

    public void setListOfEmployer(List<Employer> listOfEmployer) {
        this.listOfEmployer = listOfEmployer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tech tech = (Tech) o;
        return uuid.equals(tech.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid);
    }
}
