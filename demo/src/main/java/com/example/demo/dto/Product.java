package com.example.demo.dto;

import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private int id;
    private String name;
    private int price;
    private int stok_count;
    private Date ins_dt;
    private Date upd_dt;
}
