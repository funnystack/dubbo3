package com.funny.study.dubbo3.provider.service;

import com.funny.study.dubbo3.api.BookDubboService;
import org.springframework.stereotype.Service;

@Service("bookDubboService")
public class BookDubboServiceImpl implements BookDubboService {

    @Override
    public String sayHello(String bookName) {
        return "hello " + bookName;
    }
}
