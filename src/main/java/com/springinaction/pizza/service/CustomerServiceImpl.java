package com.springinaction.pizza.service;

import com.springinaction.pizza.domain.Customer;

public class CustomerServiceImpl implements CustomerService {
  public CustomerServiceImpl() {}
  
  public Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException {
    if("13535430871".equals(phoneNumber)) {
      Customer customer = new Customer();
      customer.setId(123);
      customer.setName("bruce");
      customer.setAddress("haizhusquer");
      customer.setCity("guangzhou");
      customer.setState("TX");
      customer.setZipCode("110");
      customer.setPhoneNumber(phoneNumber);
      return customer;
    } else {
      throw new CustomerNotFoundException();
    }
  }
}
