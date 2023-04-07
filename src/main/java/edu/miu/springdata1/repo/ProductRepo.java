package edu.miu.springdata1.repo;

import edu.miu.springdata1.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepo extends CrudRepository<Product,Integer> {




    public List<Product> findByPriceGreaterThan(float price);

//    @Query(value = "SELECT * FROM POST WHERE AUTHOR = :author", nativeQuery = true)
//    public List<Post> findByAuthor(@Param("author") String author);


    @Query( "select p from Product p where count(p.reviews) >= :num" )
    public List<Product> findProductWithReviews(int num); // 10

    public List<Product> findProductByName(String name);




}
