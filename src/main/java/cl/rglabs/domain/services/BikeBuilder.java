package cl.rglabs.domain.services;

import cl.rglabs.domain.entities.Bike;

import java.util.UUID;

public class BikeBuilder {
    private UUID uuid;

    public BikeBuilder setUUID(UUID uuid) {
        this.uuid = uuid;
        return this;
    }

    public Bike createBike() {
        return new Bike(uuid);
    }
}