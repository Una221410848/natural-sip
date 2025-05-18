package za.co.naturalsip.factory;

/* AddressFactory.java
Author: Coben Maistry - 220235686
  Date - 17th May 2025 */

import org.junit.jupiter.api.Test;
import za.co.naturalsip.domain.Address;
import static org.junit.jupiter.api.Assertions.*;

public class AddressFactoryTest {

    @Test
    public void testCreateAddress() {
        String streetName = "streetName";
        String cityName = "cityName";
        String stateName = "stateName";
        String postalCode = "postalCode";

        Address address = AddressFactory.createAddress(streetName, cityName, stateName, postalCode);
        assertEquals(streetName, address.getStreetName());
        assertEquals(cityName, address.getCityName());
        assertEquals(stateName, address.getStateName());
        assertEquals(postalCode, address.getPostalCode());

    }
}
