/**
 *
 */
package cl.rglabs;

import cl.rglabs.domain.entities.Bike;
import cl.rglabs.domain.entities.User;
import cl.rglabs.domain.services.BikeBuilder;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

/**
 *
 */
public class BikeTool
{
    public static void main(String[] args) {
        Bike bike = (new BikeBuilder()).createBike();
        User user = new User();
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date now = Date.from(Instant.now());

        System.out.println("Current date is: " + formatter.format(now));
        try {
            user.setBirthdate(formatter.parse("1985-11-12"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Bike UUID is: " + bike.uuid2String());
        System.out.println("User uuid: " + user.uuid2String() + " age is: " + user.getAge());
    }
}
