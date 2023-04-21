package edu.miu.springdata1.repo;


import edu.miu.springdata1.dto.input.BookCriteriaRequest;
import edu.miu.springdata1.entity.Book;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class BookCriteriaSearch {

    private final EntityManager em;


    public List<Book> findAllByCriteria(BookCriteriaRequest bookCriteriaRequest) { // You can make a search request object for the input
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Book> criteriaQuery = criteriaBuilder.createQuery(Book.class);
        List<Predicate> predicates = new ArrayList<>();

        // select * from Review
        Root<Book> root = criteriaQuery.from(Book.class);

        if (bookCriteriaRequest.getTitle() != null) {
            Predicate titlePredicate = criteriaBuilder.like(root.get("title"), "%" + bookCriteriaRequest.getTitle() + "%");
            predicates.add(titlePredicate);
        }
        if (bookCriteriaRequest.getCategory() != null) {
            Predicate catPredicate = criteriaBuilder.like(root.get("category").get("name"), "%" + bookCriteriaRequest.getCategory() + "%");
            predicates.add(catPredicate);
        }
        if (bookCriteriaRequest.getMinPrice() != null) {
            Predicate mipPredicate = criteriaBuilder.greaterThanOrEqualTo(root.get("price"), bookCriteriaRequest.getMinPrice());
            predicates.add(mipPredicate);
        }
        if (bookCriteriaRequest.getMaxPrice() != null) {
            Predicate mapPredicate = criteriaBuilder.lessThanOrEqualTo(root.get("price"), bookCriteriaRequest.getMaxPrice());
            predicates.add(mapPredicate);
        }
        criteriaQuery.where(
                criteriaBuilder.and(predicates.toArray(new Predicate[0]))
        );

        TypedQuery<Book> query = em.createQuery(criteriaQuery);
        return query.getResultList();
    }
}

