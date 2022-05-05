package cl.rglabs.domain.services;

import cl.rglabs.domain.entities.Bike;

import java.util.UUID;

public class BikeBuilder {

    public Bike createBike() {
        return new Bike();
    }
}
