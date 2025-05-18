package za.co.naturalsip.factory;
/* AddressFactory.java
Author: Coben Maistry - 220235686
  Date - 18th May 2025*/

import za.co.naturalsip.domain.Address;

public class AddressFactory {
    public static Address createAddress( String streetName, String cityName,
                                         String stateName,String postalCode) {
        return new Address.Builder()
                .setStreetName(streetName)
                .setCityName(cityName)
                .setStateName(stateName)
                .setPostalCode(postalCode)
                .build();



    }
}
