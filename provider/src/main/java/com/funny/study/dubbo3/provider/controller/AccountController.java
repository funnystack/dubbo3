package com.funny.study.dubbo3.provider.controller;

import com.funny.study.dubbo3.provider.entity.BookEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author
 */
@RestController
@RequestMapping({"/api"})
public class AccountController {


    @ResponseBody
    @RequestMapping(value = "/books")
    public List<BookEntity> books() {
        return null;
    }

}
