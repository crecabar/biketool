package cl.rglabs.biketool.core.domain.entities;

import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.Assert.*;

public class ActivityTest {

    @Test
    public void activityTime() throws ParseException {
        Activity activity = new Activity();
        String isoDatePattern = "yyyy-MM-dd'T'HH:mm:ss'Z'";
        DateFormat formatter = new SimpleDateFormat(isoDatePattern);

        activity.setStartedAt(formatter.parse("2022-05-04T11:00:00Z"));
        //activity.setEndedAt(formatter.parse("2022-05-04T11:10:00Z"));
        //assertEquals("00:10:00", activity.activityTime());
        assertThrows(NullPointerException.class, activity::activityTime);

        activity.setStartedAt(formatter.parse("2022-05-04T11:00:00Z"));
        activity.setEndedAt(formatter.parse("2022-05-04T11:01:00Z"));
        assertEquals("00:01:00", activity.activityTime());

        activity.setStartedAt(formatter.parse("2022-05-04T11:00:00Z"));
        activity.setEndedAt(formatter.parse("2022-05-04T11:00:00Z"));
        assertEquals("00:00:00", activity.activityTime());

        activity.setStartedAt(formatter.parse("2022-05-04T11:00:00Z"));
        activity.setEndedAt(formatter.parse("2022-05-04T12:45:21Z"));
        assertEquals("01:45:21", activity.activityTime());
    }

    @Test
    public void addElapsedTime() throws ParseException {
        Activity activity = new Activity();
        String isoDatePattern = "yyyy-MM-dd'T'HH:mm:ss'Z'";
        DateFormat formatter = new SimpleDateFormat(isoDatePattern);

        activity.setStartedAt(formatter.parse("2022-05-04T11:00:00Z"));
        activity.setElapsedTime(600);
        activity.addElapsedTime();
        assertEquals("2022-05-04T11:10:00Z", formatter.format(activity.getEndedAt()));

        activity.setStartedAt(formatter.parse("2022-05-04T11:00:00Z"));
        activity.setElapsedTime(60);
        activity.addElapsedTime();
        assertEquals("2022-05-04T11:01:00Z", formatter.format(activity.getEndedAt()));

        activity.setStartedAt(formatter.parse("2022-05-04T11:00:00Z"));
        activity.setElapsedTime(0);
        activity.addElapsedTime();
        assertEquals("2022-05-04T11:00:00Z", formatter.format(activity.getEndedAt()));

        activity.setStartedAt(formatter.parse("2022-05-04T11:00:00Z"));
        activity.setElapsedTime(6321);
        activity.addElapsedTime();
        assertEquals("2022-05-04T12:45:21Z", formatter.format(activity.getEndedAt()));
    }
}
