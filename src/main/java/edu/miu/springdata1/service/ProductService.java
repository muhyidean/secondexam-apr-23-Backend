package edu.miu.springdata1.service;


import edu.miu.springdata1.dto.ProductDto;
import edu.miu.springdata1.entity.Product;

import java.util.List;

public interface ProductService {

//    void save(Product p);
    void save(ProductDto p);

    void delete(int id);

    Product getById(int id);

    List<Product> getAll();
}
