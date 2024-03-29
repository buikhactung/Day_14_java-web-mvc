package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    public static Map<Integer,Customer> customers;

    static{
        customers = new HashMap<>();
        customers.put(1,new Customer(1,"Dư","quocdu@codegym.com","Bắc Ninh"));
        customers.put(2,new Customer(2,"Đức","vanduc@codegym.com","Hải Phòng"));
        customers.put(3,new Customer(3,"Hoàng","thienhoang@codegym.com","Hưng yên"));
        customers.put(4,new Customer(4,"Quý","luongquy@codegym.com","Thái Nguyên"));

    }
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(),customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id) ;
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id,customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
