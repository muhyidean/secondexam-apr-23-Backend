package edu.miu.springdata1.dto;

import edu.miu.springdata1.entity.UserDto;
import lombok.Data;

@Data
public class ProductDto {
    private String name;
    private int price;
    private int idUser;

}
