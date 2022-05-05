package cl.rglabs.biketool.core.domain.entities;

import java.util.Date;

public abstract class AbstractDeletableEntity extends AbstractEntity implements DeletableInterface {

    protected Date deletedAt;

    public AbstractDeletableEntity() {
        super();
    }

    @Override
    public Date getDeletedAt() {
        return this.deletedAt;
    }

    @Override
    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }
}
