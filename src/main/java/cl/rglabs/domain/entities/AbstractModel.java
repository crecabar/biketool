package cl.rglabs.domain.entities;

import java.time.Instant;
import java.util.Date;

public abstract class AbstractModel extends AbstractEntity implements TimeStampableInterface, DeletableInterface{

    protected Date createdAt;
    protected Date modifiedAt;
    protected Date deletedAt;

    public AbstractModel() {
        super();
        Date now = Date.from(Instant.now());
        this.createdAt = now;
        this.modifiedAt = now;
        this.deletedAt = null;
    }

    @Override
    public Date getDeletedAt() {
        return this.deletedAt;
    }

    @Override
    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    @Override
    public boolean isDeleted() {
        return (this.deletedAt == null);
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
