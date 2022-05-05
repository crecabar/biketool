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
    private boolean replaced;

    public Component() {
        super();
    }

    public ComponentType getType() {
        return type;
    }

    public void setType(ComponentType type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getAddedAt() {
        return addedAt;
    }

    public void setAddedAt(Date addedAt) {
        this.addedAt = addedAt;
    }

    public Date getReplacedAt() {
        return replacedAt;
    }

    public void setReplacedAt(Date replacedAt) {
        this.replacedAt = replacedAt;
    }

    public boolean isReplaced() {
        return replaced;
    }

    public void setReplaced(boolean replaced) {
        this.replaced = replaced;
    }
}
