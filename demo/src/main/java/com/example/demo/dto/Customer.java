package com.example.demo.dto;

import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
    private int id;
    private String name;
    private int age;
    private int buy_count;
    private Date ins_dt;
    private Date upd_dt;
}
