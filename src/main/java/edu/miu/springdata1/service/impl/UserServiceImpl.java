package edu.miu.springdata1.service.impl;

import edu.miu.springdata1.entity.Product;
import edu.miu.springdata1.entity.User;
import edu.miu.springdata1.model.PagingRequest;
import edu.miu.springdata1.repo.UserRepo;
import edu.miu.springdata1.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UserServiceImpl implements UserService {

    @PersistenceContext
    EntityManager entityManager;

    private final UserRepo userRepo;

    /**
     * FOR DEMO PURPOSES
     *  
     * @param pagingRequest .sortBy CANNOT be null !!!
     * @return
     */
    public Page<User> paging(PagingRequest pagingRequest) {
        var direction = (pagingRequest.isAscending()) ? Sort.Direction.ASC : Sort.Direction.DESC;

        var request = PageRequest
                .of(pagingRequest.getPage(), pagingRequest.getPageSize(), direction,pagingRequest.getSortBy());


        return userRepo.findAll(request);
    }

    @Override
    public List<User> findAll() {
        return userRepo.findAll();
    }

    @Override
    public User findById(int id) {
        return null ;
    }


}
