package cl.rglabs.biketool.core.domain.entities;

import java.util.Date;

public interface TimeStampableInterface
{
    /**
     *
     * @return
     */
    public Date getCreatedAt();

    /**
     *
     * @return
     */
    public Date getModifiedAt();

    /**
     *
     * @param createdAt
     */
    public void setCreatedAt(Date createdAt);

    /**
     *
     * @param modifiedAt
     */
    public void setModifiedAt(Date modifiedAt);
}
