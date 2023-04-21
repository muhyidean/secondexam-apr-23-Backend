package edu.miu.springdata1.controller;


import edu.miu.springdata1.dto.input.BookCriteriaRequest;
import edu.miu.springdata1.entity.Author;
import edu.miu.springdata1.entity.Book;
import edu.miu.springdata1.repo.BookCriteriaSearch;
import edu.miu.springdata1.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    private final BookRepo bookService;
    public BookController(BookRepo bookService) {
        this.bookService = bookService;
    }

    @Autowired
    BookCriteriaSearch bookCriteriaSearch;

    @PostMapping
    public void save(@RequestBody Book b) {
        bookService.save(b);
    }

    @GetMapping
    public List<Book> findAll(
            @RequestParam(value = "category", required = false) String category,
            @RequestParam(value = "title", required = false) String title,
            @RequestParam(value = "minPrice", required = false) Integer minPrice,
            @RequestParam(value = "maxPrice", required = false) Integer maxPrice) {
        if (category != null || title != null || minPrice != null || maxPrice != null) {
            var b = new BookCriteriaRequest(category,title,minPrice,maxPrice);
            return bookCriteriaSearch.findAllByCriteria( b );
        } else
            return bookService.findAll();
    }


    @GetMapping("/{id}")
    public Book findById(@PathVariable int id) {
        var book = bookService.findById(id);
        return book.orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        bookService.deleteById(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") int bookId, @RequestBody Book book) {
//        bookService.update(bookId,book);
    }

    @GetMapping("/{id}/authors")
    public List<Author> getAuthorsBook(@PathVariable int id) {
        return bookService.findById(id).get().getAuthors();
    }


}
