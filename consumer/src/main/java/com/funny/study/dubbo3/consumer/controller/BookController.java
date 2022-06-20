package com.funny.study.dubbo3.consumer.controller;

import com.funny.study.dubbo3.api.BookDubboService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author
 */
@RestController
@RequestMapping({"/api"})
public class BookController {

    @Resource
    private BookDubboService bookDubboService;


    @RequestMapping(value = "/books")
    public String books(String bookName) {
        return bookDubboService.sayHello(bookName);
    }

}
