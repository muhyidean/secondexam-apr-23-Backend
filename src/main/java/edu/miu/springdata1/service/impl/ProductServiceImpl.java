package edu.miu.springdata1.service.impl;

import edu.miu.springdata1.dto.input.ProductDto;
import edu.miu.springdata1.dto.output.ProductSimpleDto;
import edu.miu.springdata1.entity.Product;
import edu.miu.springdata1.entity.Review;
import edu.miu.springdata1.repo.ProductRepo;
import edu.miu.springdata1.repo.UserRepo;
import edu.miu.springdata1.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepo productRepo;
    @Autowired
    UserRepo userRepo;

    @PersistenceContext
    EntityManager entityManager;

//    @Override
//    public void save(ProductDto dto) {
//        Product p = new Product();
//        p.setName(dto.getName());
//        p.setPrice(dto.getPrice());
//        productRepo.save(p);
//
//    }

    public void save(ProductDto dto){
        Product p = new Product();
        p.setName(dto.getName());
        p.setPrice(dto.getPrice());
        var user = userRepo.findById(dto.getIdUser());
        p.setUser(user);
        productRepo.save(p);
    }



    @Override
    public void delete(int id) {

        productRepo.deleteById(id);
    }

    @Override
    public Product getById(int id) {
        return productRepo.findById(id).get();
    }

    @Override
    public List<Product> getAll() {
        var result= new ArrayList<Product>();
        productRepo.findAll().forEach(result::add);
        return result;
    }

    @Override
    public ProductSimpleDto test(){
        var p = entityManager.find(Product.class,111);

        ProductSimpleDto dto = new ProductSimpleDto();
        dto.setName(p.getName());
        dto.setPrice(p.getPrice());
        return dto;
    }

    @Override
    public Product testLazyObject(){
        var p = entityManager.find(Product.class,111);
        return p;
    }
}
