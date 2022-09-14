package com.example.webformdemo1;

import com.example.webformdemo1.domian.Account;
import com.example.webformdemo1.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@SpringBootApplication
public class WebFormDemo1Application {



    public static void main(String[] args) {

        SpringApplication.run(WebFormDemo1Application.class, args);

    }

}
