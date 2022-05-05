package cl.rglabs.domain.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Bike extends AbstractModel{

    /**
     *
     */
    protected Set<Component> components;

    protected String name;

    protected String make;

    protected String model;

    protected Date purchaseDate;

    protected int startMileage;

    public Bike() {
        super();
        components = new HashSet<>();
    }

    public void addComponent(Component component) {
        this.components.add(component);
    }
}
