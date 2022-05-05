/**
 *
 */
package cl.rglabs;

import cl.rglabs.domain.entities.Bike;
import cl.rglabs.domain.services.BikeBuilder;

/**
 *
 */
public class BikeTool
{
    public static void main(String[] args) {
        Bike bike = (new BikeBuilder()).createBike();

        System.out.println("Bike UUID is: " + bike.uuid2String());
    }
}
