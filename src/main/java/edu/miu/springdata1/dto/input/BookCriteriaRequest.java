package edu.miu.springdata1.dto.input;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookCriteriaRequest {

    private String category;
    private String title;
    private Integer minPrice;
    private Integer maxPrice;
}
