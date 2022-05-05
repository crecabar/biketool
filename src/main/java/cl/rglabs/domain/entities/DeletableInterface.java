package cl.rglabs.domain.entities;

import java.util.Date;

public interface DeletableInterface
{
    /**
     *
     * @return
     */
    public Date getDeletedAt();

    /**
     *
     * @param deletedAt
     */
    public void setDeletedAt(Date deletedAt);
}
