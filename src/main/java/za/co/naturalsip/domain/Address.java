package za.co.naturalsip.domain;

import java.lang.module.ModuleDescriptor;

/*Product.java
Address POJO Class
Author - Coben Maistry 220235686
Date 10 May 2025
 */
public class Address {

    private String streetName;
    private String cityName;
    private String stateName;
    private String postalCode;

    public Address() {

    }
    public Address (Builder builder) {

        this.streetName = builder.streetName;
        this.cityName = builder.cityName;
        this.stateName = builder.stateName;
        this.postalCode = builder.postalCode;
    }
    public String getStreetName() {
        return streetName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getStateName() {
        return stateName;
    }
    public String getPostalCode() {
        return postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", stateName='" + stateName + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }





    public static class Builder {
        private String streetName;
        private String cityName;
        private String stateName;
        private String postalCode;

        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }
        public Builder setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public Builder setStateName(String stateName) {
            this.stateName = stateName;
            return this;
        }
        public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }
        public Builder copy(Address address) {
            this.streetName = address.streetName;
            this.cityName = address.cityName;
            this.stateName = address.stateName;
            this.postalCode = address.postalCode;

        }
        public Address build() {
            return new Address(this);
        }
    }

