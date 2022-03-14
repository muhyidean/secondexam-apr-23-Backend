package edu.miu.springdata1.entity;

import lombok.Data;

@Data
public class Review {

    private int id;
    private String comment;
    private int numberOfStars;

}
