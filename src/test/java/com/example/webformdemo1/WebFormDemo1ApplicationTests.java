package com.example.webformdemo1;

import com.example.webformdemo1.domian.Account;
import com.example.webformdemo1.mapper.AccountMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class WebFormDemo1ApplicationTests {

    @Autowired
    private AccountMapper mapper;

    @Test
    void contextLoads() {
        System.out.println("这是测试类入口");
        List<Account> list = mapper.findAll();
        System.out.println(list);
    }

}
