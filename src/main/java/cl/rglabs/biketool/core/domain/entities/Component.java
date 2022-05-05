/**
 *
 */
package cl.rglabs.biketool.core.domain.entities;

import java.util.Date;

/**
 *
 */
public class Component extends AbstractModel{
    private ComponentType type;
    private String make;
    private String model;
    private Date addedAt;
    private Date replacedAt;

    public Component() {
        super();
    }
}
