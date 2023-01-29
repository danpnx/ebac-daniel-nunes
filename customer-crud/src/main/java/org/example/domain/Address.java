package org.example.domain;


/**
 *
 * @author Daniel
 */
public class Address {
    private String street;
    private Integer number;
    private String city;
    private String state;

    public Address(String street, Integer number, String city, String state) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public Integer getNumber() {
        return number;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Address { " +
                "street = '" + street + '\'' +
                ", number = " + number +
                ", city = '" + city + '\'' +
                ", state = '" + state + '\'' +
                " }";
    }
}
