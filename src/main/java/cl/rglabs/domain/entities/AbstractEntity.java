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
    public AbstractEntity() {
        this.uuid = UUID.randomUUID();
    }

    /**
     *
     */
    public AbstractEntity setUuid(UUID uuid) {
        this.uuid = uuid;

        return this;
    }

    /**
     *
     */
    public UUID getUuid() {
        return this.uuid;
    }

    public String uuid2String() {
        return this.uuid.toString();
    }
}
