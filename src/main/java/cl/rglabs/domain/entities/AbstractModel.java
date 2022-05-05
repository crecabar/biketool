package cl.rglabs.domain.entities;

import java.util.Date;
import java.util.UUID;

public abstract class AbstractModel extends AbstractEntity implements TimeStampableInterface, DeletableInterface{

    /**
     * @param uuid
     */
    public AbstractModel(UUID uuid) {
        super(uuid);
    }

    @Override
    public Date getDeletedAt() {
        return null;
    }

    @Override
    public void setDeletedAt(Date deletedAt) {

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
