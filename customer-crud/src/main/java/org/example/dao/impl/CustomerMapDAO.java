package org.example.dao.impl;

import org.example.dao.ICustomerDAO;
import org.example.domain.Customer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author Daniel
 */
public class CustomerMapDAO implements ICustomerDAO {
    private final Map<Long, Customer> map;

    public CustomerMapDAO() {
        this.map = new HashMap<>();
    }

    @Override
    public boolean registerCustomer(Customer customer) {
        if(this.map.containsKey(customer.getCpf())) {
            return false;
        }

        this.map.put(customer.getCpf(), customer);
        return true;
    }

    @Override
    public boolean deleteCustomer(Long cpf) {
        if(!this.map.containsKey(cpf)) {
            return false;
        }

        this.map.remove(cpf);
        return true;
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        if(!this.map.containsKey(customer.getCpf())) {
            return false;
        }

        Customer savedCustomer = this.map.get(customer.getCpf());
        savedCustomer.setName(customer.getName());
        savedCustomer.setContactNumber(customer.getContactNumber());
        savedCustomer.setAddress(customer.getAddress());

        this.map.replace(savedCustomer.getCpf(), savedCustomer);
        return true;
    }

    @Override
    public Customer findCustomer(Long cpf) {
        return this.map.get(cpf);
    }

    @Override
    public Collection<Customer> findAllCustomers() {
        return this.map.values();
    }
}
