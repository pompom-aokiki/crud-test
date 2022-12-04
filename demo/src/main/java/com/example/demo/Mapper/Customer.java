package com.example.demo.Mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Customer {

    // TODO xmlでautoMappingする
    @Insert("insert into users (customer) values (#{customer})")
    public boolean create(Customer customer);
}
