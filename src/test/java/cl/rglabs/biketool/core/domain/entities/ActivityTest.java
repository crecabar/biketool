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
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        activity.setStartedAt(formatter.parse("2022-05-04 11:00:00"));
        activity.setEndedAt(formatter.parse("2022-05-04 11:10:00"));
        assertEquals("00:10:00", activity.activityTime());

        activity.setStartedAt(formatter.parse("2022-05-04 11:00:00"));
        activity.setEndedAt(formatter.parse("2022-05-04 11:01:00"));
        assertEquals("00:01:00", activity.activityTime());

        activity.setStartedAt(formatter.parse("2022-05-04 11:00:00"));
        activity.setEndedAt(formatter.parse("2022-05-04 11:00:00"));
        assertEquals("00:00:00", activity.activityTime());

        activity.setStartedAt(formatter.parse("2022-05-04 11:00:00"));
        activity.setEndedAt(formatter.parse("2022-05-04 12:45:21"));
        assertEquals("01:45:21", activity.activityTime());
    }
}
