package org.example.domain;

import java.util.Objects;

/**
 *
 * @author Daniel
 */
public class Customer {
    private String name;
    private final Long cpf;
    private Long contactNumber;
    private Address address;

    public Customer(
        String name,
        String cpf,
        String contactNumber,
        String street,
        String number,
        String city,
        String state
    ) {
        this.name = name;
        this.cpf = Long.valueOf(cpf.trim());
        this.contactNumber = Long.valueOf(contactNumber.trim());
        this.address = new Address(
                street,
                Integer.valueOf(number.trim()),
                city,
                state
        );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCpf() {
        return cpf;
    }

    public Long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(cpf, customer.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return "Customer { " +
                "name = '" + name + '\'' +
                ", cpf = " + cpf +
                ", contactNumber = " + contactNumber +
                ", address = " + address.toString() +
                " }";
    }
}