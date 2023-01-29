package org.example.dao;

import org.example.domain.Customer;

import java.util.Collection;


/**
 *
 * @author Daniel
 */
public interface ICustomerDAO {

    boolean registerCustomer(Customer customer);
    boolean deleteCustomer(Long cpf);
    boolean updateCustomer(Customer customer);
    Customer findCustomer(Long cpf);
    Collection<Customer> findAllCustomers();
}
