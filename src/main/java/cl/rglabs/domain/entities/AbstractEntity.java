/**
 * 
 */
package cl.rglabs.domain.entities;

import java.util.UUID;

/**
 * 
 */
public abstract class AbstractEntity
{

    /**
     * 
     */
    protected UUID uuid;

    /**
     * 
     */
    public AbstractEntity(UUID uuid) {
        this.uuid = uuid;
    }

    /**
     * 
     */
    protected AbstractEntity setUuid(UUID uuid) {
        this.uuid = uuid;

        return this;
    }

    /**
     * 
     */
    protected UUID getUuid() {
        return this.uuid;
    }
}