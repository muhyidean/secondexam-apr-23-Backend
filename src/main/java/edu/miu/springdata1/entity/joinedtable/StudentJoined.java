package edu.miu.springdata1.entity.joinedtable;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@Data
@PrimaryKeyJoinColumn(name = "id_student")
public class StudentJoined extends PersonJoined {

    private String major;
    private int tuitionFee;
}
