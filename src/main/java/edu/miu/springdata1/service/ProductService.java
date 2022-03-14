package edu.miu.springdata1.service;


import edu.miu.springdata1.entity.Product;

public interface ProductService {

    void save(Product p);

    void delete(int id);

    Product getById(int id);
}
