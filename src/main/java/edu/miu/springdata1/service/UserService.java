package edu.miu.springdata1.service;

import edu.miu.springdata1.entity.Product;
import edu.miu.springdata1.entity.User;
import edu.miu.springdata1.model.PagingRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface UserService {
    Page<User> paging(PagingRequest pagingRequest);

    List<User> findAll();

    User findById(int id);
}
