/**
 * 
 */
package cl.rglabs.domain.entities;

/**
 * 
 */
public abstract class AbstractEntity
{

    /**
     * 
     */
    protected String UUID;

    /**
     * 
     */
    public AbstractEntity(String uUID) {
        UUID = uUID;
    }

    /**
     * 
     */
    protected AbstractEntity setUUID(String UUID) {
        this.UUID = UUID;

        return this;
    }

    /**
     * 
     */
    protected String getUUID() {
        return this.UUID;
    }
}