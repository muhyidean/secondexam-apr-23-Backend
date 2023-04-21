package edu.miu.springdata1.repo;


import edu.miu.springdata1.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepo extends JpaRepository<Book,Integer> {

    @Query("select b from Book b where size(b.authors) = :num")
    public List<Book> getBooksByAuthorsEquals(int num);
//
//    @Query("select b from Book b Join b.authors a  where b.category.name= :category   ")
//    public List<Book> getBooksCatAndCountry( String category);


    // JUST FOR THE STREAM SOLUTION
    public List<Book> findBooksByCategory(String category);
}
