package com.cinexpress.videofriend.services;

import java.util.List;

import com.cinexpress.videofriend.models.Customer;
import com.cinexpress.videofriend.models.Movie;

public interface CustomerService {
    Customer createCustomer(Long id);
    void addClientToCompany(Long customerId, Long companyId);
    List<Movie> listAllCustomerMovies(Customer customer);
    boolean hasPremiumSubscription(Long customerId);
    void deactivatePremiumSubscription(Long customerId);
    Customer getCustomerById(Long id);
    Customer updateCustomer(Long id, Customer customer);
}
