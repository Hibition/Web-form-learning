package com.example.webformdemo1.mapper;


import com.example.webformdemo1.domian.Account;
import com.example.webformdemo1.domian.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AccountMapper {

    @Select("select * from t_account")
    public List<Account> findAll();

    @Insert("INSERT INTO book(name, author) VALUES(#{name},#{author})")
    public int insertData(Book book);
}
