package cl.rglabs.biketool.core.domain.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Bike extends AbstractModel{

    protected Set<Component> components;

    protected String name;

    protected String make;

    protected String model;

    protected boolean defaultBike;

    protected Date addedAt;

    protected Date retiredAt;

    protected int startMileage;

    public Bike() {
        super();
        components = new HashSet<>();
    }

    public void addComponent(Component component) {
        this.components.add(component);
    }

    public Set<Component> getComponents() {
        return components;
    }

    public void setComponents(Set<Component> components) {
        this.components = components;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isDefaultBike() {
        return defaultBike;
    }

    public void setDefaultBike(boolean defaultBike) {
        this.defaultBike = defaultBike;
    }

    public Date getAddedAt() {
        return addedAt;
    }

    public void setAddedAt(Date addedAt) {
        this.addedAt = addedAt;
    }

    public Date getRetiredAt() {
        return retiredAt;
    }

    public void setRetiredAt(Date retiredAt) {
        this.retiredAt = retiredAt;
    }

    public int getStartMileage() {
        return startMileage;
    }

    public void setStartMileage(int startMileage) {
        this.startMileage = startMileage;
    }
}
