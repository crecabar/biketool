package cl.rglabs.domain.entities;

import java.util.Date;
import java.util.UUID;

public abstract class AbstractTimeStamplableEntity extends AbstractEntity implements TimeStampableInterface{

    protected Date createdAt;
    protected Date modifiedAt;

    public AbstractTimeStamplableEntity() {
        super();
    }

    @Override
    public Date getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public Date getModifiedAt() {
        return this.modifiedAt;
    }

    @Override
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public void setModifiedAt(Date modifiedAt) {
        this.modifiedAt = modifiedAt;
    }
}
