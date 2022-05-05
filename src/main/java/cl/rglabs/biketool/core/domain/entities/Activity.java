package cl.rglabs.biketool.core.domain.entities;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Activity extends AbstractModel{

    protected Date startedAt;

    protected Date endedAt;

    protected String type;

    protected double distance;

    protected double height;

    public Date getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }

    public Date getEndedAt() {
        return endedAt;
    }

    public void setEndedAt(Date endedAt) {
        this.endedAt = endedAt;
    }

    public String activityTime() {
        long diff = this.endedAt.getTime() - this.startedAt.getTime();
        long hours = TimeUnit.MILLISECONDS.toHours(diff) % 24;
        long minutes = TimeUnit.MILLISECONDS.toMinutes(diff) % 60;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(diff) % 60;

        return (hours < 10 ? "0" + hours : hours ) +
            ":" + (minutes < 10 ? "0" + minutes : minutes ) +
            ":" + (seconds < 10 ? "0" + seconds : seconds);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
