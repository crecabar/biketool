package cl.rglabs.domain.entities;

import java.util.Date;
import java.util.UUID;

public abstract class AbstractDeletableEntity extends AbstractEntity implements DeletableInterface {

    /**
     * @param uuid
     */
    public AbstractDeletableEntity(UUID uuid) {
        super(uuid);
    }

    @Override
    public Date getDeletedAt() {
        return null;
    }

    @Override
    public void setDeletedAt(Date deletedAt) {

    }
}
