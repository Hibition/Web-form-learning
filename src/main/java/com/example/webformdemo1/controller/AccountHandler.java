package com.example.webformdemo1.controller;

import com.example.webformdemo1.domian.Account;
import com.example.webformdemo1.domian.Book;
import com.example.webformdemo1.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/account")
public class AccountHandler {


    @Autowired
    private AccountMapper mapper;

    @CrossOrigin
    @GetMapping("/find")
    private List<Account> findAll(){
        return mapper.findAll();
    };

    @PostMapping("/input")
    public int insertData(@RequestBody Book book) {
        System.out.println(book.toString());
        return mapper.insertData(book);
    }

}
