package edu.miu.springdata1.service.impl;

import edu.miu.springdata1.dto.ProductDto;
import edu.miu.springdata1.entity.Product;
import edu.miu.springdata1.entity.User;
import edu.miu.springdata1.repo.ProductRepo;
import edu.miu.springdata1.repo.UserRepo;
import edu.miu.springdata1.service.ProductService;
import edu.miu.springdata1.service.UserService;
import lombok.RequiredArgsConstructor;
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

    private final ProductRepo productRepo;
    private final UserService userService;

//    @Override
//    public void save(Product p) {
//        productRepo.save(p);
//
//    }

    public void save(ProductDto dto){
        Product p = new Product();
        p.setName(dto.getName());
        p.setPrice(dto.getPrice());

        var user = userService.findById(dto.getIdUser());
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
}
