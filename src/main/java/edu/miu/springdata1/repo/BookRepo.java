package edu.miu.springdata1.repo;


import edu.miu.springdata1.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepo extends JpaRepository<Book,Integer> {

}
