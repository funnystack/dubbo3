package com.funny.study.dubbo3.consumer;

import com.funny.study.dubbo3.api.BookDubboService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = ConsumerApplication.class)
@RunWith(SpringRunner.class)
public class DubboTest {

    @Resource
    private BookDubboService bookDubboService;

    @Test
    public void testDistrict() {
        String res = bookDubboService.sayHello("123");
        System.out.println(res);
    }

}
