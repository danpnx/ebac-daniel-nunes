package org.example.dao.impl;

import org.example.dao.ICustomerDAO;
import org.example.domain.Customer;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author Daniel
 */
public class CustomerSetDAO implements ICustomerDAO {
    private final Set<Customer> set;

    public CustomerSetDAO(Set<Customer> set) {
        this.set = new HashSet<>();
    }

    @Override
    public boolean registerCustomer(Customer customer) {
        this.set.add(customer);
        return true;
    }

    @Override
    public boolean deleteCustomer(Long cpf) {
        boolean isRemoved = false;
        for(Customer c: set) {
            if(c.getCpf().equals(cpf)) {
                this.set.remove(c);
                isRemoved = true;
                break;
            }
        }

        return isRemoved;
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        boolean isUpdated = false;
        for(Customer c: set) {
            if(c.getCpf().equals(customer.getCpf())) {
                c.setName(customer.getName());
                c.setContactNumber(customer.getContactNumber());
                c.setAddress(customer.getAddress());
                this.set.add(c);
                isUpdated = true;
            }
        }

        return isUpdated;
    }

    @Override
    public Customer findCustomer(Long cpf) {
        for(Customer c: set) {
            if(c.getCpf().equals(cpf)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public Collection<Customer> findAllCustomers() {
        return set;
    }
}
