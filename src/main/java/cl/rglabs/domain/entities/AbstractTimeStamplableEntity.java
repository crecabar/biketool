package cl.rglabs.domain.entities;

import java.util.Date;
import java.util.UUID;

public abstract class AbstractTimeStamplableEntity extends AbstractEntity implements TimeStampableInterface{

    /**
     * @param uuid
     */
    public AbstractTimeStamplableEntity(UUID uuid) {
        super(uuid);
    }

    @Override
    public Date getCreatedAt() {
        return null;
    }

    @Override
    public Date getModifiedAt() {
        return null;
    }

    @Override
    public void setCreatedAt(Date createdAt) {

    }

    @Override
    public void setModifiedAt(Date modifiedAt) {

    }
}
